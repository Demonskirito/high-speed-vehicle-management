package com.example.studypractice.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.studypractice.mapper.MrecordMapper;
import com.example.studypractice.pojo.Mrecord;
import com.example.studypractice.service.MrecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@Service
public class MrecordServiceImpl extends ServiceImpl<MrecordMapper, Mrecord> implements MrecordService {

	@Override
	public Page selectPage(Page p) {
		// TODO Auto-generated method stub
		return baseMapper.selectPage(p);
	}

}
