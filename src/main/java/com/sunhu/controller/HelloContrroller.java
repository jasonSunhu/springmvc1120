package com.sunhu.controller;

import com.sunhu.entity.SysUser;
import com.sunhu.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * Created by Administrator on 2019/11/20.
 */
@Controller
@RequestMapping("/main")
public class HelloContrroller {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/frist")
    public String helloWorld(){
        SysUser user = new SysUser();
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        user.setUsername("jack");
        user.setPassword("12344");
        user.setAge(21);
        sysUserMapper.insert(user);
        return "hello";
    }
}
