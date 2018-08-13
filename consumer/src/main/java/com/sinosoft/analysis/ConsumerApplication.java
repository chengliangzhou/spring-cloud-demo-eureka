package com.sinosoft.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //获取服务发现能力
public class ConsumerApplication {
    public static void main(String [] args){
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced //开启客户端负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
