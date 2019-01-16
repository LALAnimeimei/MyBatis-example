package com.example.multi_thread.Enum;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(MyObject.Factory.getConnection().hashCode());
        }
    }
}
