package com.mybatis.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{

    int id;
    String name;
    int age;
    uutable uut;
    List<dd> dds;
    List<orderdetail> orders;

    public List<orderdetail> getOrders() {
        return orders;
    }

    public void setOrders(List<orderdetail> orders) {
        this.orders = orders;
    }

    public uutable getUut() {
        return uut;
    }

    public void setUut(uutable uut) {
        this.uut = uut;
    }

    public List<dd> getDds() {
        return dds;
    }

    public void setDds(List<dd> dds) {
        this.dds = dds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
