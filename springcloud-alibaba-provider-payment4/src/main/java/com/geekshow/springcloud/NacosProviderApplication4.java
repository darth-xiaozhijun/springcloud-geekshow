package com.geekshow.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderApplication4 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication4.class, args);
    }
}
