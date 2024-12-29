package com.example.studypractice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.studypractice.mapper.UsersMapper;
import com.example.studypractice.pojo.Users;
import com.example.studypractice.service.UsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
