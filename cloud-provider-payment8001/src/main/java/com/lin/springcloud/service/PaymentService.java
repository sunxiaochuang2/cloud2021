package com.lin.springcloud.service;

import com.lin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Author : jiuZui
 * DATE :   2021/10/30 10:47
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

