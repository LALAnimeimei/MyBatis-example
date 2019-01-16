package com.mybatis.controller;

import com.mybatis.mapper.UserDataSource.UserMapper;
import com.mybatis.mapper.BookDataSource.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class multiController {
    @Autowired
    private BookMapper mapper;

    @Autowired
    private UserMapper mapper2;

    @RequestMapping(value = "/go")
    @ResponseBody
    public String go(){
//        DatabaseContextHolder.setDatabaseType(DatabaseType.book);
        String title=mapper.getBookList().get(0).getTitle();
//        DatabaseContextHolder.setDatabaseType(DatabaseType.mybatis);
        String name=mapper2.getList().get(0).getName();
        return name+"   "+title;
    }
}
