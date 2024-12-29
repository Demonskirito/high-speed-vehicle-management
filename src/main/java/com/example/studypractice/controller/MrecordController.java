package com.example.studypractice.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.example.studypractice.pojo.Cheliang;
import com.example.studypractice.pojo.Jiashiyuan;
import com.example.studypractice.pojo.Mrecord;
import com.example.studypractice.pojo.Zhandian;
import com.example.studypractice.service.CheliangService;
import com.example.studypractice.service.JiashiyuanService;
import com.example.studypractice.service.MrecordService;
import com.example.studypractice.service.ZhandianService;
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
@RequestMapping("/mrecord")
public class MrecordController {
	@Autowired
	MrecordService s;
	@RequestMapping("/insert")
	public String insert (@RequestBody Mrecord z) {
		z.setBdate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		s.save(z);
		return "1";
	}
	@RequestMapping("/update")
	public String update (@RequestBody Mrecord z) {
		z.setEdate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		s.updateById(z);
		//查询驾驶员
		Cheliang c = cs.getById(z.getCid());
		Jiashiyuan j = js.getById(c.getJid());
		j.setJmoney(j.getJmoney()-z.getMprice());
		js.updateById(j);
		return "1";
	}

	@Autowired
	JiashiyuanService js;
	@Autowired
	CheliangService cs;
	@Autowired
	ZhandianService zs;

	@RequestMapping("/selectMoney")
	public Integer selectMoney (@RequestBody Mrecord z) {
		//查询收费金额
		int min=Math.min(z.getBeginid(), z.getEndid());
		int max=Math.max(z.getBeginid(), z.getEndid());
		List<Zhandian> list = zs.query().select("SUM(zprice) zprice").gt("zid", min).le("zid", max).list();
		int zprice =list.get(0).getZprice();
		//查询驾驶员
		Cheliang c = cs.getById(z.getCid());
		Jiashiyuan j = js.getById(c.getJid());
		if(j.getJmoney()<zprice) {
			return j.getJmoney()-zprice;
		}

		return zprice;
	}
	@RequestMapping("/selectTotal")
	public int selectTotal() {
		return s.count();
	}
	@RequestMapping("/selectByPage")
	public List selectByPage(int page,int line) {
		return s.selectPage(new Page(page,line)).getRecords();
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

