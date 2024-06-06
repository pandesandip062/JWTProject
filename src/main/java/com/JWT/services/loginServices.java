package com.JWT.services;

import com.JWT.Entity2.loginDetails;
import com.JWT.repository.loginRepo;
import com.JWT.repository.userRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class loginServices {


    @Autowired
    loginRepo repo;

    @Autowired
    public PasswordEncoder passwordEncoder;




    public loginDetails saveLoginDetails(loginDetails login){
        login.setUser_username(UUID.randomUUID().toString());
        login.setUser_password(passwordEncoder.encode(login.getUser_password()));
     loginDetails newlogin = repo.save(login);
     return newlogin;

    }
}
