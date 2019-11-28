package com.sunhu.task;

import com.sunhu.service.sysuser.SysUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/11/27.
 */
@Component
public class TaskJobs {
    private final static Logger LOGGER = LogManager.getLogger(TaskJobs.class);

    @Autowired
    private SysUserService sysUserService;

    @Scheduled(cron = "0/30 * * * * ? ") //10秒一次
    public void addTaskJob(){
        LOGGER.info("===========add user start===========");
        sysUserService.addUser();
        LOGGER.info("===========add user end=============");
    }

}
