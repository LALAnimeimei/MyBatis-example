package com.mybatis.service;

import com.mybatis.entity.orderdetail;
import com.mybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public List<orderdetail> OrderToUser(){
        List list=orderMapper.OrderToUser();
        System.out.println(list);
        return list;
    }
}
