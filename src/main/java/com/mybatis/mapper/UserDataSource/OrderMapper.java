package com.mybatis.mapper.UserDataSource;

import com.mybatis.entity.orderdetail;

import java.util.List;

public interface OrderMapper {
    List<orderdetail> OrderToUser();
}
