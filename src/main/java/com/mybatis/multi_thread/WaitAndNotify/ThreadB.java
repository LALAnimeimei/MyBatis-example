package com.mybatis.multi_thread.WaitAndNotify;

public class ThreadB extends Thread{
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public  void  run(){
        try {
            synchronized (lock){
                for(int i=0;i<10;i++){
                    MyList.add();
                    if(MyList.size()==5){
                        lock.notify();
                        System.out.println("已经通知！");
                    }
                    System.out.println("添加了第"+(i+1)+"个元素");
                    Thread.sleep(100);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
