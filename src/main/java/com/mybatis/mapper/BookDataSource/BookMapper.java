package com.mybatis.mapper.BookDataSource;

import com.mybatis.entity.Book;

import java.util.List;

public interface BookMapper extends BookPublicMapper{
    List<Book> getBookList();
}
