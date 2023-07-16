package com.linwayne.springbootmall.dao;

import com.linwayne.springbootmall.dto.UserRegisterRequest;
import com.linwayne.springbootmall.model.User;

public interface UserDao {
    Integer createUser (UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

}
