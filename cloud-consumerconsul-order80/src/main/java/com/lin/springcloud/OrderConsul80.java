package com.lin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author : jiuZui
 * DATE :   2021/10/31 15:58
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class OrderConsul80
{
    public static void main(String[] args) {
        SpringApplication.run(OrderConsul80.class, args);
    }
}