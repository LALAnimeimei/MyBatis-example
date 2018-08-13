package com.mybatis.mapper;

import com.mybatis.entity.orderdetail;

import java.util.List;

public interface OrderMapper {
    List<orderdetail> OrderToUser();
}
