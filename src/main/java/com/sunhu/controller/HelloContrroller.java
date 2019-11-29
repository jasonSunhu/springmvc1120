package com.sunhu.controller;

import com.sunhu.dao.CronMapper;
import com.sunhu.entity.Cron;
import com.sunhu.entity.CronExample;
import com.sunhu.entity.SysUser;
import com.sunhu.dao.SysUserMapper;
import com.sunhu.service.sysuser.SysUserService;
import com.sunhu.task.DynamicTaskJob;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
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
    @Autowired
    private DynamicTaskJob dynamicTaskJob;
    @Autowired
    private CronMapper cronMapper;

    @RequestMapping("/frist")
    public String helloWorld(){
        logger.warn("start");
        sysUserService.addUser();
        logger.error("end");
        return "hello";
    }

    @RequestMapping("/job")
    public String dynamicTaskJob(){
        CronExample e = new CronExample();
        List<Cron> cronList = cronMapper.selectByExample(e);
        dynamicTaskJob.startCron(cronList);
        return "hello";
    }
}
