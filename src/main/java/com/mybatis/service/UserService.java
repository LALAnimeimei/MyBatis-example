package com.mybatis.service;

import com.mybatis.entity.User;
import com.mybatis.entity.uutable;
import com.mybatis.mapper.UserMapper;
import com.mybatis.mapper.UuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UuMapper uuMapper;


    //测试事务，其中uu为插入失败测试事务是否回滚

    public void insertData(){
        User user=new User();
        user.setName("hxx");
        user.setAge(12);

        boolean success=userMapper.insertUser(user);

        uutable uutable=new uutable();
        uutable.setId(1);
        uutable.setUu(1);
        uuMapper.insertData(uutable);
        System.out.println(success);

    }

    public void BatchInsert(){
        List<User> users=new ArrayList<>();
        for(int i=0;i<5;i++){
            User user=new User();
            user.setName("user:"+i);
            user.setAge(i);
            users.add(user);
        }
        userMapper.BatchInsert(users);
    }

    public void createUser(){
        HashMap<String,Object> map=new HashMap();
        map.put("name","hx");
        map.put("age",123);
        userMapper.createUser(map);
    }

    public void update(){
        HashMap<String,Object> map=new HashMap();
        map.put("id",1);
        map.put("name","update");
        map.put("age",2);
        userMapper.updateUser(map);
    }

    public List<User> selectData(){
        HashMap<String,Object> map=new HashMap();
        map.put("sort","desc");
//        map.put("id",2);

        List<User> userList=userMapper.selectData(map);
        return userList;
    }

    public List<User> multiParmQuery(){
        return userMapper.multiParmQuery("update",null);
    }

    public List<User> chooseQuery(){
        HashMap map=new HashMap();
        map.put("uname","hx");
        map.put("age",1);
        map.put("name",3);
        return userMapper.chooseQuery(map);
    }

    public List mixquery(){
        List list=userMapper.mixquery();
        System.out.println(list);
        return list;
    }

    //一对一
    public List resultmapquery(){
        List list=userMapper.resultmapquery();
        System.out.println(list);
        return list;
    }

    //一对多
    public List OneToMulti(){
        List list=userMapper.OneToMulti();
        System.out.println(list);
        return list;
    }

    //一对多   user对Order
    public List UserToOrders(){
        List list =userMapper.UserToOrders();
        System.out.println(list);
        return list;
    }

    //一user对多order对多item
    public List UserToItem(){
        List list=userMapper.UserToItem();
        System.out.println(list.toArray());
        return list;
    }
}
