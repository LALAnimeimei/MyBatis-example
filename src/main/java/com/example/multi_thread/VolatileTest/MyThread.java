package com.example.multi_thread.VolatileTest;

public class MyThread implements Runnable{
    volatile public static  int count;
    synchronized private  void addCount(){
        long sr=System.currentTimeMillis();
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count+"  " +"开始时间"+sr+"结束时间"+ System.currentTimeMillis());
    }
    @Override
    public void run(){
        addCount();
    }
}
