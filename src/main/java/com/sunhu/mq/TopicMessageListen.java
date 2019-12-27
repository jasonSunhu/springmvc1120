package com.sunhu.mq;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2019/12/26.
 */
public class TopicMessageListen implements MessageListener {

    private static final Logger LOGGER = LogManager.getLogger(TopicMessageListen.class);

    @Override
    public void onMessage(Message message) {
        LOGGER.info("开始监听=======");
        try {
            TextMessage textMessage = (TextMessage) message;
            LOGGER.info("消息内容是："+textMessage.getText());
        } catch (JMSException e) {
            LOGGER.error("获取消息失败：{}",e);
        }
    }
}
