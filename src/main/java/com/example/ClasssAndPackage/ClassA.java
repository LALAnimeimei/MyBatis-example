package com.example.ClasssAndPackage;

public class ClassA {
    static {
        System.out.println("类A已经加载了");
    }

    private String name="hx";
    public void printString(){
        System.out.println(name);
    }
}