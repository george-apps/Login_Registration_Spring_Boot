package com.appsgeorge.Login_Registration.service;

import com.appsgeorge.Login_Registration.dto.UserDto;
import com.appsgeorge.Login_Registration.model.User;
import com.appsgeorge.Login_Registration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(),
                passwordEncoder.encode(userDto.getPassword()),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getRole());
        return userRepository.save(user);
    }
}
