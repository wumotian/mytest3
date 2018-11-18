package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {


    @Insert("insert  into `users`(`username`,`password`,`telephone`) values (#{username},#{password},#{telephone})")
    int add(User user);


    @Select("select * from users where username = #{username}")
    User findByName(User user);
}
