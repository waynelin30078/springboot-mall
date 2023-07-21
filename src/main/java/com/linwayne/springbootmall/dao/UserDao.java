package com.linwayne.springbootmall.dao;

import com.linwayne.springbootmall.dto.UserRegisterRequest;
import com.linwayne.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser (UserRegisterRequest userRegisterRequest);

}
