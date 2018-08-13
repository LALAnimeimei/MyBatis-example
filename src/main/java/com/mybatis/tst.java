package com.mybatis;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class tst {
    public  static void main(String[] args){
        Set<String> set=new TreeSet();
        set.add("测试");
        set.add("test");
        set.add("测试");
        System.out.println();

        Set<Integer> set1=new HashSet();
        set1.add(4);
        set1.add(4);
        set1.add(5);set1.add(3);
        System.out.println(set1);
    }
}
