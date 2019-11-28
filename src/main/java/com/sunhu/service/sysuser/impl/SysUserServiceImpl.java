package com.sunhu.service.sysuser.impl;

import com.sunhu.dao.SysUserMapper;
import com.sunhu.entity.SysUser;
import com.sunhu.service.sysuser.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Administrator on 2019/11/27.
 */
@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void addUser() {
        SysUser user = new SysUser();
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        user.setUsername("jack");
        user.setPassword("12344");
        user.setAge(21);
        sysUserMapper.insert(user);
    }
}
