package com.linany.spring.controller;

import com.linany.spring.service.UserService;
import lombok.Data;

@Data
public class UserController {
    private UserService userService;
}
