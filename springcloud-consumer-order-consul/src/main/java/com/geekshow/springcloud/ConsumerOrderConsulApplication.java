package com.geekshow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderConsulApplication.class,args);
    }
}
