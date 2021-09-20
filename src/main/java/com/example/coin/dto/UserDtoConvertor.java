package com.example.coin.dto;

import com.example.coin.model.Users;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConvertor {

    public UserDto convert(Users user){
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setUsername(user.getUsername());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());

        return userDto;
    }
}
