package org.example.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageProducer {
    @Autowired
    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend("my.routing.key", message);
    }

    public String sendAndReceiveMessage(String message) {
//         The exchange, routing key, and the message to send
        String response = (String) rabbitTemplate.convertSendAndReceive("myTopicExchange", "my.routing.key", message);
        return response;
    }
}