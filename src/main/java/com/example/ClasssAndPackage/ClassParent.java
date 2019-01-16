package com.example.ClasssAndPackage;

public class ClassParent {
    public static  void main(String[] args){
        System.out.println("进入main方法");
        try {
            Class.forName("com.example.ClasssAndPackage.ClassA",true,ClassLoader.getSystemClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        ClassA a=new ClassA();
//        a.printString();
    }
}
