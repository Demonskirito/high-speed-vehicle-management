package com.example.studypractice.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.studypractice.pojo.Mrecord;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
public interface MrecordService extends IService<Mrecord> {
	Page selectPage(Page p);
}
