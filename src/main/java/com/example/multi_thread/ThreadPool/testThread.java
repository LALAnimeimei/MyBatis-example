package com.example.multi_thread.ThreadPool;

public class testThread implements Runnable{
    @Override
    public void run(){
        try
        {
            Thread.sleep(300);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
