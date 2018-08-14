package com.mybatis.service;


import com.mybatis.entity.orderdetail;
import com.mybatis.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrderService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderMapper orderMapper;

    public List<orderdetail> OrderToUser(){
        List list=orderMapper.OrderToUser();
        logger.info("你好info");
        logger.debug("你好debug");
        System.out.println(list);
        return list;
    }
}
