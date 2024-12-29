package com.example.studypractice.controller;


import java.util.ArrayList;
import java.util.List;

import com.example.studypractice.pojo.Users;
import com.example.studypractice.service.UsersService;
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
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UsersService s;
	@RequestMapping("/insert")
	public String insert (@RequestBody Users z) {
		s.save(z);
		return "1";
	}
	@RequestMapping("/update")
	public String update (@RequestBody Users z) {
		s.updateById(z);
		return "1";
	}
	@RequestMapping("/delete")
	public String delete (String usid) {
		s.removeById(usid);
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
	@RequestMapping("/login")
	public Users login(String usid,String upwd) {
		Users u=s.getById(usid);
		if(u!=null&&u.getUpwd().equals(upwd)) {
			return u;
		}
		return null;
	}

	@RequestMapping("/selectList")
	public List selectList() {
		return s.list();
	}

	@RequestMapping("/search")
	public List search(String uname) {
		return s.query().like("uname", uname).list();
	}
}

