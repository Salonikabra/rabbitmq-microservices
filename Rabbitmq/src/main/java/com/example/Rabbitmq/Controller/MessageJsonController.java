package com.example.Rabbitmq.Controller;


import com.example.Rabbitmq.DTO.User;
import com.example.Rabbitmq.Publisher.RabbitmqJsonProducer;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MessageJsonController {

    @Autowired
    private RabbitmqJsonProducer jsonProducer;


    @PostMapping("/publish")
    public ResponseEntity<String> sendJsonMessage(@RequestBody User user)
    {
        jsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("json message sent to rabbitmq");

    }
}
