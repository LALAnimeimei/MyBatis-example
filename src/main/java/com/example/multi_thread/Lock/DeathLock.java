package com.example.multi_thread.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class DeathLock {
    private ReentrantLock lock=new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println(lock.getHoldCount());
//            lock.lock();
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try{
            lock.lock();
            System.out.println(lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
