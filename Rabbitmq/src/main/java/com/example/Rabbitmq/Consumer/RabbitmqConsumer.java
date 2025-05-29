package com.example.Rabbitmq.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqConsumer {

    private static final Logger logger= LoggerFactory.getLogger(RabbitmqConsumer.class);


    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consume(String message)
    {
        logger.info(String.format("Received message->%s",message));


    }
}
