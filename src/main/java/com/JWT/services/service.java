package com.JWT.services;


import com.JWT.Entities.user;
import com.JWT.Entity2.loginDetails;
import com.JWT.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class service {

    @Autowired
    private userRepo repo;



    public List<user> getUsers(){
       return repo.findAll();
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    public user creatUser(user User){
        User.setUserId(UUID.randomUUID().toString());
        User.setPassword(passwordEncoder.encode(User.getPassword()));
        return repo.save(User);
    }













}
