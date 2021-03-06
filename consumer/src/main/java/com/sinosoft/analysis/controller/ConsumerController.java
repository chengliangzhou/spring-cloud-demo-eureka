package com.sinosoft.analysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://provider/hello", String.class).getBody();
    }
}
