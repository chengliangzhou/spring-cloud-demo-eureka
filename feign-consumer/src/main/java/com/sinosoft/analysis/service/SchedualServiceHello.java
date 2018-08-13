package com.sinosoft.analysis.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider")
public interface SchedualServiceHello {
    @RequestMapping("/hello")
    String sayHello();
}
