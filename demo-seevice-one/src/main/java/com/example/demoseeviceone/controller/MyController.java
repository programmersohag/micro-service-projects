package com.example.demoseeviceone.controller;

import com.example.demoseeviceone.config.LimitConfig;
import com.example.demoseeviceone.model.MyConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final LimitConfig limitConfig;

    public MyController(LimitConfig limitConfig) {
        this.limitConfig = limitConfig;
    }

    @GetMapping("/getLimit")
    public MyConfiguration getMyConfig(){
    return new MyConfiguration(limitConfig.getMin(), limitConfig.getMax());
    }
}
