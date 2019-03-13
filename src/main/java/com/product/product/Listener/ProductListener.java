package com.product.product.Listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.product.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Component
public class ProductListener {

    @Autowired
    private ObjectMapper objectMapper;

    //biar product receive message tiap add category baru
    @KafkaListener(topics = "categories")
    public void listenTopicBelajar(String body) throws Exception {
        Category category = objectMapper.readValue(body, Category.class);

        log.info("Receive Message {}", category);
    }

}
