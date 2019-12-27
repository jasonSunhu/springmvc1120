package com.sunhu.mq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/26.
 */
@Component
public class TopicMessageProducer {
    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;

    public void totouchmq1() {

        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage msg = session.createTextMessage();
                Map<String, String> map = new HashMap<String, String>();
                map.put("name", "你好");
                msg.setText(map.toString());
                return msg;
            }
        });
    }

}
