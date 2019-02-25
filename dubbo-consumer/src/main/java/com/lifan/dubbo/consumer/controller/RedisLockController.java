package com.lifan.dubbo.consumer.controller;

import com.lifan.dubbo.consumer.lock.impl.JedisLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiFan
 * @Date: 2019/2/23
 * * RedisLock测试模块
 */
@RestController
@RequestMapping("/redis")
public class RedisLockController {

    private static final Logger logger = LoggerFactory.getLogger(RedisLockController.class);

    /**
     * 秒杀商品数量10个
     */
    private int goodNum = 10;

    private static final String LOCK_NO = "redis_distribution_lock_no_";

    private int taskNum = 100;

    /**
     * redis分布式锁测试
     * 模拟1000个线程同时执行业务，修改资源
     */
    @RequestMapping(value = "/redisLock", method = {RequestMethod.GET})
    public String testRedisDistributionLock1() {
         //task();
        for (int i = 0; i < taskNum; i++) {
            new Thread(() -> task()).start();
        }
        return "OK";
    }

    /**
     * 创建一个redis分布式锁任务
     */
    private void task() {
        JedisLock lock = new JedisLock(LOCK_NO + "1");
        if (lock.acquire()) {
            try {
                //开始执行任务
                logger.info("当前库存的数量："+goodNum);
                if (goodNum == 0) {
                    logger.info("停止减库存任务");
                } else {
                    goodNum--;
                    logger.info("开始减库存任务");
                }
            } finally {
                lock.release();
            }
        }
    }

}
