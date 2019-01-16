package com.example.multi_thread.WaitAndNotify;

public class RunNotify {
    public static void main(String[] args){
        try{
            Object lock=new Object();
            ThreadA a=new ThreadA(lock);
            a.setName("a");
            ThreadA c=new ThreadA(lock);
            c.setName("c");
            a.start();
            c.start();
            Thread.sleep(50);
            ThreadB b=new ThreadB(lock);
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
