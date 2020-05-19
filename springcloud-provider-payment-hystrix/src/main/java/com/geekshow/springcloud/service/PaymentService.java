package com.geekshow.springcloud.service;

import com.geekshow.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);
}
