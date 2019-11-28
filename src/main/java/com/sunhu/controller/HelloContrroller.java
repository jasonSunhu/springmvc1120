package com.sunhu.controller;

import com.sunhu.entity.SysUser;
import com.sunhu.dao.SysUserMapper;
import com.sunhu.service.sysuser.SysUserService;
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
    private SysUserService sysUserService;

    @RequestMapping("/frist")
    public String helloWorld(){
        logger.warn("start");
        sysUserService.addUser();
        logger.error("end");
        return "hello";
    }
}
