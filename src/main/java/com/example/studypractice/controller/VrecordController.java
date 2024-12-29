package com.example.studypractice.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.example.studypractice.pojo.Cheliang;
import com.example.studypractice.pojo.Jiashiyuan;
import com.example.studypractice.pojo.Vrecord;
import com.example.studypractice.pojo.Wzitem;
import com.example.studypractice.service.CheliangService;
import com.example.studypractice.service.JiashiyuanService;
import com.example.studypractice.service.VrecordService;
import com.example.studypractice.service.WzitemService;
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
@RequestMapping("/vrecord")
public class VrecordController {
	@Autowired
	VrecordService s;
	@RequestMapping("/insert")
	public String insert (@RequestBody Vrecord z) {
		z.setVtime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		s.save(z);
		return "1";
	}
	@Autowired
	WzitemService ws;
	@Autowired
	CheliangService cs;
	@Autowired
	JiashiyuanService js;
	@RequestMapping("/update")
	public String update (@RequestBody Vrecord z) {
		Wzitem w = ws.getById(z.getWid());
		Cheliang c=cs.getById(z.getCid());
		Jiashiyuan j=js.getById(c.getJid());
		System.out.println(w);
		System.out.println(j);
		if(j.getJmoney()<w.getWmoney()) {
			return "2";
		}
		j.setJmoney(j.getJmoney()-w.getWmoney());
		j.setJtotal(j.getJtotal()-w.getWscore());
		js.updateById(j);
		z.setVstate(1);
		s.updateById(z);
		return "1";
	}
	@RequestMapping("/delete")
	public String delete (Integer vid) {
		s.removeById(vid);
		return "1";
	}
	@RequestMapping("/deleteList")
	public String deleteList (@RequestBody ArrayList<Integer> ids) {
		s.removeByIds(ids);
		return "1";
	}
	@RequestMapping("/selectTotal")
	public int selectTotal() {
		return s.count();
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page,int line) {
		return s.query().orderByAsc("vstate").page(new Page(page,line)).getRecords();
	}

	@RequestMapping("/selectList")
	public List selectList() {
		return s.list();
	}

	@RequestMapping("/search")
	public List search(String cid) {
		return s.query().like("cid", cid).list();
	}
}

