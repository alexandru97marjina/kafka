package com.kafka.example.demo;

import com.kafka.example.demo.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/kafka")
@RestController
public class KafkaController {

    @Autowired
    private KafkaService service;

    @GetMapping
    public ResponseEntity<String> runKafka() throws InterruptedException {
        service.runKafka();

        return ResponseEntity.ok("OK");
    }

}
