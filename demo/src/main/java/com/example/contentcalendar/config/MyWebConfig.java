package com.example.contentcalendar.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyWebConfig {

    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }

}
