package com.example.multi_thread.SinglAndMulThread;

public class MyObject {
    private static MyObject myObject;

    private static class handler{
        private static MyObject myObject=new MyObject();
    }

    public static MyObject getInstance1(){
        return handler.myObject;
    }

    private  MyObject(){
        System.out.println("我执行了！ ");
    }

    public static MyObject getInstance(){
        try{
            if(myObject!=null){
            }else{
                Thread.sleep(3000);
                //用DCL(Double-Check Locking)的方式进行同步  双检测的方法
                synchronized (MyObject.class) {
                    if(myObject==null) {
                        myObject = new MyObject();
                    }else {
                        System.out.println(Thread.currentThread().getName() + "获取hashcode的时候发现有对象存在，hash值为" + myObject.hashCode());
                        myObject=new MyObject();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
