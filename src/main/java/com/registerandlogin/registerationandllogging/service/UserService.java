package com.registerandlogin.registerationandllogging.service;

import com.registerandlogin.registerationandllogging.dto.UserDto;
import com.registerandlogin.registerationandllogging.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
