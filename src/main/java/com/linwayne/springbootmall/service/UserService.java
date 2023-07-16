package com.linwayne.springbootmall.service;

import com.linwayne.springbootmall.dto.UserRegisterRequest;
import com.linwayne.springbootmall.model.User;

public interface UserService {
    Integer register (UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
