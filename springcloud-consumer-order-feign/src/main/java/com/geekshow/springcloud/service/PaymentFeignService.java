package com.geekshow.springcloud.service;

import com.geekshow.springcloud.entities.CommonResult;
import com.geekshow.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping("/payment/create")
    CommonResult<Payment> create(Payment payment);

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPayment(@PathVariable("id") Long id);

    @GetMapping("/payment/getForEntity/{id}")
    ResponseEntity<CommonResult> getPayment2(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
