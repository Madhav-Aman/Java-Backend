package com.simplecrud.project1.service;

import com.simplecrud.project1.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    public String addUser(User i);

    public ArrayList<User> getUsers();

    public User getUserById(Integer i);
    public ArrayList<User> getuserByName(String name);

    public String deleteById(Integer n);

}
