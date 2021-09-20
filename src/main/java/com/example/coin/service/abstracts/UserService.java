package com.example.coin.service.abstracts;

import com.example.coin.dto.UserDto;
import com.example.coin.dto.UserLoginRequest;
import com.example.coin.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getAllUsers();


    UserDto login(UserLoginRequest request);

    Optional<Users> findByUsername(String s);

    Users getById(Long userId);
}
