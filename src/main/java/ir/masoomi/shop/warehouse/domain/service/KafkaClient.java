package ir.masoomi.shop.warehouse.domain.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaClient {


    private final static String topicName = "shop";
    private final static String groupIdName = "shopGroup";
    @KafkaListener(topics =topicName, groupId = groupIdName)
    public void consumeFromTopic(String message) {
        System.out.println(message);
    }

    public void sendToTopic() {

    }

}
