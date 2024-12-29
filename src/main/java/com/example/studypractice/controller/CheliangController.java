package com.example.studypractice.controller;


import java.util.ArrayList;
import java.util.List;

import com.example.studypractice.pojo.Cheliang;
import com.example.studypractice.service.CheliangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@RestController
@RequestMapping("/cheliang")
public class CheliangController {
	@Autowired
	CheliangService s;
	@RequestMapping("/insert")
	public String insert (@RequestBody Cheliang z) {
		s.save(z);
		return "1";
	}
	@RequestMapping("/update")
	public String update (@RequestBody Cheliang z) {
		s.updateById(z);
		return "1";
	}
	@RequestMapping("/delete")
	public String delete (String cid) {
		s.removeById(cid);
		return "1";
	}
	@RequestMapping("/deleteList")
	public String deleteList (@RequestBody ArrayList<String> ids) {
		s.removeByIds(ids);
		return "1";
	}
	@RequestMapping("/selectTotal")
	public int selectTotal() {
		return s.count();
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page,int line) {
		return s.page(new Page(page,line)).getRecords();
	}

	@RequestMapping("/selectList")
	public List selectList() {
		return s.list();
	}

	@RequestMapping("/selectNotIn")
	public List selectNotIn() {
		return s.query().notInSql("cid", "SELECT cid FROM mrecord WHERE mstate=1").list();
	}

	@RequestMapping("/search")
	public List search(String cname) {
		return s.query().like("cname", cname).list();
	}
}

