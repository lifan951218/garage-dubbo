package com.lifan.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:dubbo-consumer.xml"})
//@ComponentScan(basePackages = {"com.lifan.garage.service","com.lifan.dubbo.consumer.controller"})
//@EnableDubbo
@SpringBootApplication

public class DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
        System.out.println("消费者启动成功");
    }

}

