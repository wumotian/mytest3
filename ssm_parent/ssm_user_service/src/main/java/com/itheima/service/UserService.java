package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {
    int add(User user);

    User findByName(User user);
}
