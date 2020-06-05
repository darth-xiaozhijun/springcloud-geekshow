package com.geekshow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientAplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientAplication.class,args);
    }
}
