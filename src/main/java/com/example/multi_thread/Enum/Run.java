package com.example.multi_thread.Enum;

public class Run {
    public static void main(String[] args) {
        MyThread object = new MyThread();
        MyThread object1 = new MyThread();
        MyThread object2 = new MyThread();
        object.start();
        object1.start();
        object2.start();
    }
}
