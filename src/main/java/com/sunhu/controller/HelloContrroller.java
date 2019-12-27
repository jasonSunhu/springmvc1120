package com.sunhu.controller;

import com.sunhu.dao.CronMapper;
import com.sunhu.entity.Cron;
import com.sunhu.entity.CronExample;
import com.sunhu.entity.SysUser;
import com.sunhu.mq.QueueMessageProducer;
import com.sunhu.mq.TopicMessageProducer;
import com.sunhu.redis.RedisService;
import com.sunhu.service.sysuser.SysUserService;
import com.sunhu.task.DynamicTaskJob;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    @Autowired
    private RedisService redisService;
    @Autowired
    private TopicMessageProducer topicMessageProducer;
    @Autowired
    private QueueMessageProducer queueMessageProducer;
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

    @RequestMapping("/getCache")
    public String getCache(){
        SysUser sysUsers = (SysUser)redisService.hget("sys_users", "efc32c1e4cad40e59f96f1064865fff8");
        return "hello";
    }

    @RequestMapping("/sendMqTopic")
    public String sendMq(){
        topicMessageProducer.totouchmq1();
        return "hello";
    }

    @RequestMapping("/sendMqQueue")
    public String sendMqQueue(){
        queueMessageProducer.sendQueueMessage();
        return "hello";
    }

}
