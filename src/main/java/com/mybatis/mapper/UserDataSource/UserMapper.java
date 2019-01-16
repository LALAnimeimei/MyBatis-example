package com.mybatis.mapper.UserDataSource;

import com.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {

    List<User> getList();

    boolean insertUser(User user);

    boolean BatchInsert(List list);

    boolean createUser(HashMap map);

    boolean updateUser(HashMap map);

    List<User> selectData(HashMap map);

    List<User> multiParmQuery(@Param("uname") String uname, @Param("name") String name);

    List<User> chooseQuery(HashMap map);

    List mixquery();

    List<User> resultmapquery();

    List<User> OneToMulti();

    List<User> UserToOrders();

    List<User> UserToItem();
}
