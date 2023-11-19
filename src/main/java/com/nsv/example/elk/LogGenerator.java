package com.nsv.example.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.stream.LongStream;

@Service
public class LogGenerator {
    private static final Logger log = LoggerFactory.getLogger(LogGenerator.class);

    public void generate(int count) {
        log.info("Start generating logs");
        LongStream.range(0, count)
                .forEach(i -> log.info("Log {}", i));
    }
}