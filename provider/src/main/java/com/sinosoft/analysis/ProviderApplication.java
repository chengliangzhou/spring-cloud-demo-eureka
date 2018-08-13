package com.sinosoft.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProviderApplication {
    public static void main(String [] args){
        SpringApplication.run(ProviderApplication.class, args);
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello, spring cloud";
    }
}
