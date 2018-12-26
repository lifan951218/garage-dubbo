package com.lifan.garage;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * * 服务提供启动类
 * @author LIFAN
 * 2018/12/24 21:22
 */

@ImportResource(value = {"classpath:dubbo-provider.xml"})
@SpringBootApplication
//@EnableDubboConfig
public class GarageProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(GarageProviderApplication.class, args);
    }
}
