package com.example.coin.controller;

import com.example.coin.dto.UserDto;
import com.example.coin.dto.UserLoginRequest;
import com.example.coin.service.abstracts.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
@CrossOrigin
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserLoginRequest request)throws Exception {
        return ResponseEntity.ok(userService.login(request));
    }
}






