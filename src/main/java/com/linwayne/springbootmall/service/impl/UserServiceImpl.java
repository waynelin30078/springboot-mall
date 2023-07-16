package com.linwayne.springbootmall.service.impl;

import com.linwayne.springbootmall.dao.UserDao;
import com.linwayne.springbootmall.dto.UserRegisterRequest;
import com.linwayne.springbootmall.model.User;
import com.linwayne.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
