package com.mybatis.multi_thread.ThreadSafeTest;

public class Run {
    public static void main(String[] args){
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        Threadname at=new Threadname(numRef,"a");
        Threadname bt=new Threadname(numRef,"b");
        at.start();
        bt.start();
    }
}
