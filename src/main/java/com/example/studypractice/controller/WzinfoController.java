package com.example.studypractice.controller;


import java.util.List;

import com.example.studypractice.pojo.Wzinfo;
import com.example.studypractice.service.WzinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * VIEW 前端控制器
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@RestController
@RequestMapping("/wzinfo")
public class WzinfoController {

	@Autowired
	WzinfoService s;

	@RequestMapping("/selectMonth")
	public List<Wzinfo> selectMonth() {
		// TODO Auto-generated method stub
		return s.selectMonth();
	}

	@RequestMapping("/selectZhan")
	public List<Wzinfo> selectZhan() {
		// TODO Auto-generated method stub
		return s.selectZhan();
	}

	@RequestMapping("/selectWzitem")
	public List<Wzinfo> selectWzitem() {
		// TODO Auto-generated method stub
		return s.selectWzitem();
	}

}

