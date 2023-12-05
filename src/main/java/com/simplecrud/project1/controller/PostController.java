package com.simplecrud.project1.controller;

import com.simplecrud.project1.entities.User;
import com.simplecrud.project1.service.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    private UserService userService;
    PostController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User s){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.addUser(s));
    }
}
