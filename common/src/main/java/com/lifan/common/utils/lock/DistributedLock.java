package com.lifan.common.utils.lock;

public interface DistributedLock {

    /**
     * 获取锁
     * @throws InterruptedException
     */
    public boolean acquire();

    /**
     * 释放锁
     */
    public void release();
}
