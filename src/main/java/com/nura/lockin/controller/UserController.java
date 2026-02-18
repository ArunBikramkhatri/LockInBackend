package com.nura.lockin.controller;

import com.nura.lockin.dto.UserDTO;
import com.nura.lockin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO) {
        if (isEmailPresent(userDTO.getEmail())){
            return ResponseEntity.status(HttpStatus.CREATED).body("User created");
        }else {
            userService.saveUser(userDTO);
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists for this email");

        }
    }

    public boolean isEmailPresent(String email){
        int x = new Random().nextInt();
        return x % 2 == 0;
    }
}
