package com.geekshow.springcloud;

import com.geekshow.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-PAYMENT", configuration = MySelfRule.class)
public class ConsumerOrderRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderRibbonApplication.class, args);
    }
}
