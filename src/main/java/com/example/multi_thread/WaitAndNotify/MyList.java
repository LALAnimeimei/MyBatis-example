package com.example.multi_thread.WaitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("antString");
    }
    public static int size(){
        return list.size();
    }
}
