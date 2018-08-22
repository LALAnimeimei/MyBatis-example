package com.mybatis.multi_thread.WaitAndNotify;

public class ThreadA extends Thread {
    private Object lock;
    private static  int i=0;
    public ThreadA(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public  void  run(){
        try{
            synchronized (lock){
                if(MyList.size()!=5){
                    System.out.println("wait begin "+System.currentTimeMillis());
                    lock.wait();
                    System.out.println(getName()+"  wait end  "+System.currentTimeMillis());
                    if(i<1) {
                        lock.notify();
                        i=i+1;
                        System.out.println(getName()+"线程又通知了一下");
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
