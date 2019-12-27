package com.sunhu.mq;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2019/12/27.
 */
public class QueueMessageListen implements MessageListener{

    private static final Logger LOGGER = LogManager.getLogger(QueueMessageListen.class);

    @Override
    public void onMessage(Message message) {
        LOGGER.info("监听queue开始========");
        TextMessage textMessage = (TextMessage) message;
        try {
            LOGGER.info("消息内容:"+textMessage.getText());
        } catch (Exception e) {
            LOGGER.error("获取queue消息失败：{}",e);
        }
    }
}
