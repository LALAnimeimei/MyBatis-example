package com.example.multi_thread.VolatileTest;

public class Run {
    public static void main(String[] args){
//        System.out.println(System.getenv());
        try{
            RunThread thread=new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为FALSE了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
