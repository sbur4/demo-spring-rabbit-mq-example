package org.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@RabbitListener(queues = "myQueue", id = "listener")
@Component
public class MessageConsumer {
    @RabbitHandler
    public void receiveMessage(String message) {
        log.info("Rabbit sender object {} received" , message);
        throw new NullPointerException();
    }
}