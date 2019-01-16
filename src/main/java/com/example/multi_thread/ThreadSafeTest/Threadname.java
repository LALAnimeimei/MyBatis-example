package com.example.multi_thread.ThreadSafeTest;

public class Threadname extends Thread{
    private HasSelfPrivateNum numRef;
    private String name;
    public Threadname(HasSelfPrivateNum numRef,String name){
        super();
        this.numRef=numRef;
        this.name="add+"+name;
    }
    @Override
    public void run(){
        super.run();
        numRef.addI(name);
    }
}
