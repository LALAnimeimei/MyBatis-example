package com.example.multi_thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private Lock lock=new ReentrantLock();

    public void testMethod(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"拿锁");
        for(int i=0 ;i<5;i++){
            System.out.println("ThreadName="+ Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}
