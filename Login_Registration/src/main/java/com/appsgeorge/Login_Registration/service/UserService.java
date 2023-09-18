package com.appsgeorge.Login_Registration.service;

import com.appsgeorge.Login_Registration.dto.UserDto;
import com.appsgeorge.Login_Registration.model.User;

public interface UserService {
    User save(UserDto userDto);
}
