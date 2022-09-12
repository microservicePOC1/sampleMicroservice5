package com.co.services.sample.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class SampleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    public String sampleApi() {
        LOGGER.info("Sample 5 Called");
        return "Hello Sample Microservice 5";
    }
    
}
