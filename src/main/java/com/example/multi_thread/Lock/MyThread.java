package com.example.multi_thread.Lock;

public class MyThread extends Thread {
    private ReentrantLockTest service;
    public MyThread(ReentrantLockTest service){
        this.service=service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
