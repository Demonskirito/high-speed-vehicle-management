package com.example.studypractice.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.studypractice.pojo.Wzinfo;

import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
public interface WzinfoService extends IService<Wzinfo> {
	List<Wzinfo> selectMonth();  //线型

	List<Wzinfo> selectZhan();	//饼型

	List<Wzinfo> selectWzitem();	//柱型
}
