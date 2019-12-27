package com.sunhu.mq;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.UUID;

/**
 * Created by Administrator on 2019/12/27.
 */
@Component
public class QueueMessageProducer {
    private static final Logger LOGGER = LogManager.getLogger(QueueMessageProducer.class);

    @Autowired
    private JmsTemplate queueJmsTemplate;

    public void sendQueueMessage(){
        queueJmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("这是给queue的消息，随机id："+ UUID.randomUUID().toString());
                LOGGER.info("发送给queue的消息体:"+textMessage.getText());
                return textMessage;
            }
        });
    }
}
