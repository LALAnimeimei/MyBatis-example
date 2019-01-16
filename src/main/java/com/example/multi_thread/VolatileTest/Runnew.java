package com.example.multi_thread.VolatileTest;

public class Runnew {
    public static void main(String[] args){
        Thread[] myThreads=new Thread[100];
        for(int i=0;i<100;i++){
            myThreads[i]=new Thread(new MyThread());
        }
        for(int i=0;i<100;i++){
            myThreads[i].start();
        }
    }
}
