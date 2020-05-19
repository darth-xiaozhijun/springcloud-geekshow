package com.geekshow.springcloud.service.service.impl;

import com.geekshow.springcloud.entities.CommonResult;
import com.geekshow.springcloud.entities.Payment;
import com.geekshow.springcloud.service.PaymentFeignService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentFeignServiceImpl implements PaymentFeignService {
    @Override
    public CommonResult<Payment> create(Payment payment) {
        return null;
    }

    @Override
    public CommonResult<Payment> getPayment(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<CommonResult> getPayment2(Long id) {
        return null;
    }

    @Override
    public String paymentFeignTimeout() {
        return null;
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
