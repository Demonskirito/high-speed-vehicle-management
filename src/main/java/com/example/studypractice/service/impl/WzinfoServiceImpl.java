package com.example.studypractice.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.studypractice.mapper.WzinfoMapper;
import com.example.studypractice.pojo.Wzinfo;
import com.example.studypractice.service.WzinfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@Service
public class WzinfoServiceImpl extends ServiceImpl<WzinfoMapper, Wzinfo> implements WzinfoService {

	@Override
	public List<Wzinfo> selectMonth() {
		// TODO Auto-generated method stub
		return baseMapper.selectMonth();
	}

	@Override
	public List<Wzinfo> selectZhan() {
		// TODO Auto-generated method stub
		return baseMapper.selectZhan();
	}

	@Override
	public List<Wzinfo> selectWzitem() {
		// TODO Auto-generated method stub
		return baseMapper.selectWzitem();
	}

}
