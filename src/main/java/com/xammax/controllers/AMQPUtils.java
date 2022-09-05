package com.xammax.controllers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitMessageOperations;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/amqp")
public class AMQPUtils {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send/{message}")
    public void test(@PathVariable(name = "message") String message){

        rabbitTemplate.convertAndSend("myQueue13", "Hello, world!-- " +message);

        rabbitTemplate.convertAndSend("spring-boot-exchange","myQueue1", "Hello, world!22 " +message);

    }

    @RabbitListener(queues = "myQueue13")
    public void listen(String in) {
        System.out.println("Message read from myQueue : " + in);
    }

}
