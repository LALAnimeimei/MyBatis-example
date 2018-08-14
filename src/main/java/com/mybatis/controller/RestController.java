package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.service.OrderService;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/test")
public class RestController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/ok")
    @ResponseBody
    public List<User> ok(){
        return userMapper.getList();
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){

        userService.insertData();

        return "OK";

    }

    @RequestMapping("/batchinsert")
    @ResponseBody
    public String batchinsert() {

        userService.BatchInsert();

        return "OK batch";

    }

    @RequestMapping("/create")
    @ResponseBody
    public String create() {

        userService.createUser();

        return "OK create";

    }

    @RequestMapping("/update")
    @ResponseBody
    public String update() {

        userService.update();

        return "OK update";

    }

    @RequestMapping("/selectData")
    @ResponseBody
    public List<User> selectData() {

        return userService.selectData();

    }

    @RequestMapping("/multiParmQuery")
    @ResponseBody
    public List<User> multiParmQuery(){
        return userService.multiParmQuery();
    }

    @RequestMapping("/chooseQuery")
    @ResponseBody
    public List<User> chooseQuery(){
        return userService.chooseQuery();
    }

    @RequestMapping("/mixquery")
    @ResponseBody
    public List mixquery(){
        return userService.mixquery();
    }

    @RequestMapping("/resultmapquery")
    @ResponseBody
    public  List resultmapquery(){
        return userService.resultmapquery();
    }

    @RequestMapping("/OneToMulti")
    @ResponseBody
    public  List OneToMulti(){
        return userService.OneToMulti();
    }

    @RequestMapping("/UserToOrders")
    @ResponseBody
    public  List UserToOrders(){
        return userService.UserToOrders();
    }

    @RequestMapping("/UserToItem")
    @ResponseBody
    public List UserToItem(){
        return userService.UserToItem();
    }

    @RequestMapping("/OrderToUser")
    @ResponseBody
    public List OrderToUser(){
        return  orderService.OrderToUser();
    }
}
