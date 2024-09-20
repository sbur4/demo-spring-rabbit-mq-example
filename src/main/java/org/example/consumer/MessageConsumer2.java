package org.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class MessageConsumer2 {

    // 1
//    @RabbitListener(queues = "myQueue")
////    @SendTo("reply.exchange/routing.reply")
//    public String processMessageFromHelloQueue2(String message) {
//        System.out.println("Received and processing message from 'hello_queue_2': " + message);
//        // Process message here and optionally return a response
//        String uuid = UUID.randomUUID().toString();
//        return message + uuid;
//    }

    // 2
    @RabbitListener(queues = "myQueue")
    @SendTo("reply.exchange/routing.reply")
    public String processMessageFromHelloQueue2(String message) {
        System.out.println("Received and processing message from 'hello_queue_2': " + message);
        // Process message here and optionally return a response
        String uuid = UUID.randomUUID().toString();
        return message + uuid;
    }

    // 3
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(value = "myQueue", durable = "true"),
//    exchange = @Exchange(value = "myTopicExchange", type = "topic"),
//    key = "my.routing.key"))
//    public String processMessageFromHelloQueue2(String message) {
//        System.out.println("Received and processing message from 'hello_queue_2': " + message);
//        // Process message here and optionally return a response
//        String uuid = UUID.randomUUID().toString();
//        return message + uuid;
//    }
}