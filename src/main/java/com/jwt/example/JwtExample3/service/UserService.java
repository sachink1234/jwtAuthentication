package com.jwt.example.JwtExample3.service;


import com.jwt.example.JwtExample3.models.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

private List<User> store=new ArrayList<>();

public UserService(){
    store.add(new User(UUID.randomUUID().toString(),"Sachin Kumar","sachink2407@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"virat Kumar","virat@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"dhoni Kumar","dhoni@gmail.com"));
    store.add(new User(UUID.randomUUID().toString(),"Kholi Kumar","kholi@gmail.com"));
}
public List<User> getUser(){
    return store;
}
}
