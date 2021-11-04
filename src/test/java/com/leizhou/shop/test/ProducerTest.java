package com.leizhou.shop.test;

import com.leizhou.shop.springboot.rocketmq.Startup;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Startup.class})
public class ProducerTest {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void testSend(){
        rocketMQTemplate.convertAndSend("springboot-rocketmq", "Hello, use spring to send");
    }
}
