package com.example.multi_thread.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *   @author 390766
 *   @date   2018/8/15  11:15
 *   @content  测试基础线程池的使用和原理
 */

public class ThreadPoolExe {
    public static void main(String[] args){
        LinkedBlockingQueue queue=new LinkedBlockingQueue<Runnable>(5);
        ThreadPoolExecutor pool=new ThreadPoolExecutor(5,10,60, TimeUnit.SECONDS,queue);
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        for(int i=0;i<20;i++){
            pool.execute(new testThread());
            System.out.println("线程池中活跃的线程数为："+pool.getPoolSize());
            if(queue.size()>0)
                System.out.println("队列中阻塞的线程数为："+queue.size());
        }

        pool.shutdown();
    }


}
