package com.example.multi_thread.SinglAndMulThread;

public class Run {
    public static  void main(String[] args){
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread.setName("A");
        myThread.start();
        myThread1.setName("B");
        myThread1.start();
        myThread2.setName("C");
        myThread2.start();
    }
}
