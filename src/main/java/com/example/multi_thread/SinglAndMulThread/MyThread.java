package com.example.multi_thread.SinglAndMulThread;

public class MyThread extends Thread {
    @Override
    public  void run(){
//        System.out.println(MyObject.getInstance().hashCode());
        System.out.println(MyObject.getInstance1().hashCode());
    }
}
