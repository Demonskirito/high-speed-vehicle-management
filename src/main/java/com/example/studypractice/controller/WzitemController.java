package com.example.studypractice.controller;


import java.util.ArrayList;
import java.util.List;

import com.example.studypractice.pojo.Wzitem;
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
@RequestMapping("/wzitem")
public class WzitemController {
	  // alt+/
		@Autowired
	  WzitemService s;
		@RequestMapping("/insert")
		public String insert (@RequestBody Wzitem z) {
			s.save(z);
			return "1";
		}
		@RequestMapping("/update")
		public String update (@RequestBody Wzitem z) {
			s.updateById(z);
			return "1";
		}
		@RequestMapping("/delete")
		public String delete (String wid) {
			s.removeById(wid);
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

		@RequestMapping("/search")
		public List search(String wcontent) {
			return s.query().like("wcontent", wcontent).list();
		}
}

