package com.simplecrud.project1.controller;


import com.simplecrud.project1.entities.User;
import com.simplecrud.project1.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/get")
public class GetController {

    private UserService userservice;
    GetController(UserService userService){
        this.userservice = userService;
    }
    /// Constructor Injection

    @GetMapping("/getUsers")
    public ResponseEntity<ArrayList<User>> getUsers(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userservice.getUsers());
    }

}
