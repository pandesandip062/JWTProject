package com.JWT.services;

import com.JWT.Entity2.loginDetails;
import com.JWT.Entities.user;
import com.JWT.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class customUserDetailsService implements UserDetailsService {

    @Autowired
    userRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //load user from database

      user User=  this.repo.findByEmail(username).orElseThrow(()->new RuntimeException("UIser not found !!"));

        return User;
    }


}
