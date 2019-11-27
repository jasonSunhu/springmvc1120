package com.sunhu.controller;

import com.sunhu.entity.SysUser;
import com.sunhu.dao.SysUserMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private final static Logger logger = LogManager.getLogger(HelloContrroller.class);

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/frist")
    public String helloWorld(){
        logger.warn("start");
        SysUser user = new SysUser();
        user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        user.setUsername("jack");
        user.setPassword("12344");
        user.setAge(21);
        sysUserMapper.insert(user);
        logger.error("end");
        return "hello";
    }
}
