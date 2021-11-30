package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author : jiuZui
 * DATE :   2021/10/30 10:38
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class PaymentMain8002
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }
}
