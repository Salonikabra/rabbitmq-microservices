package com.example.Rabbitmq.Publisher;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;


    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private static final Logger logger=LoggerFactory.getLogger(RabbitmqProducer.class);



    public void sendMessage(String message)
    {
        logger.info(String.format("Message sent-> %s",message));
        rabbitTemplate.convertAndSend(exchange,routingKey,message);
    }





}
