package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author : jiuZui
 * DATE :   2021/10/30 10:38
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class PaymentMain8001
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
