package com.geekshow.springcloud.service;

import com.geekshow.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
