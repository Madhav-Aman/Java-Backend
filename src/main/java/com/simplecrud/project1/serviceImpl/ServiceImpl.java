package com.simplecrud.project1.serviceImpl;

import com.simplecrud.project1.entities.User;
import com.simplecrud.project1.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements UserService {

    ArrayList<User> arr = new ArrayList<>();

    public String addUser(User i){
        arr.add(i);
        return "data has been added";
    }

    public ArrayList<User> getUsers(){
        return arr;
    }

    public User getUserById(Integer i){
        for(User s: arr){
            if(s.getId() == i){
                return s;
            }
        }
        return null;
    }

    public ArrayList<User> getuserByName(String name){
        ArrayList<User> a= new ArrayList<>();
        for(User s: arr){
            if(s.getName() == name){
                a.add(s);
            }
        }
        return a;
    }

    public String deleteById(Integer n){

        Integer pos = -1;
        for(int i=0;i<arr.size();i++){

            if(arr.get(i).getId()== n){
                pos=i;
                break;
            }
        }
        arr.remove(pos);
        return "data deleted";
    }
}
