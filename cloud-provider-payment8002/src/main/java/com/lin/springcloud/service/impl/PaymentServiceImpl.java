package com.lin.springcloud.service.impl;

import com.lin.springcloud.dao.PaymentDao;
import com.lin.springcloud.entities.Payment;
import com.lin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author : jiuZui
 * DATE :   2021/10/30 10:48
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
