package com.mybatis.multi_thread.VolatileTest;

public class RunThread extends Thread {
     private static boolean isRunning=true; //volatile强行从公共内存中取值
    public boolean isRunning(){
        return  isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run(){
        super.run();
        System.out.println("进入Run 了");

        while (isRunning) {
            synchronized ("12"){

            }
        }

        System.out.println("线程被终止了");

}
}
