package com.nsv.example.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EchoController {

    @Autowired
    private LogGenerator generator;
    private static final Logger log = LoggerFactory.getLogger(EchoController.class);


    @GetMapping("/generate")
    public ResponseEntity<String> test(@RequestParam(name = "count", defaultValue = "0") Integer count) {
        log.info("Test request received with count: {}", count);
        generator.generate(count);
        return ResponseEntity.ok("Success!");
    }

    @GetMapping("/warn")
    public ResponseEntity<String> warn() {
        log.warn("warn");
        return ResponseEntity.ok("Success!");
    }

    @GetMapping("/error")
    public ResponseEntity<String> error() {
        log.error("error");
        return ResponseEntity.ok("Success!");
    }
}
