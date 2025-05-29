package com.example.Rabbitmq.Publisher;

import com.example.Rabbitmq.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqJsonProducer {


    @Value("${rabbitmq.exchange.name}")
    private String exchange;


    @Value("${rabbitmq.jsonRouting.key}")
    private String routingJsonKey;

    private static Logger logger= LoggerFactory.getLogger(RabbitmqJsonProducer.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendJsonMessage(User user)
    {
        logger.info(String.format("Json message sent->%s",user.toString()));
        rabbitTemplate.convertAndSend(exchange,routingJsonKey,user);


    }

}
