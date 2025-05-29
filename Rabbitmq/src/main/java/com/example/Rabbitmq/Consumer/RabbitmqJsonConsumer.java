package com.example.Rabbitmq.Consumer;

import com.example.Rabbitmq.DTO.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqJsonConsumer {

    private static final Logger LOGGER=LoggerFactory.getLogger(RabbitmqConsumer.class);


    @RabbitListener(queues = {"${rabbitmq.jsonQueue.name}"})
    public void consumeJsonMessage(User user)
    {
        LOGGER.info(String.format("Received JSON message->%s",user.toString()));


    }

}
