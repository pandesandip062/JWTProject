package com.JWT.Contollers;


import com.JWT.Entities.user;
import com.JWT.Entity2.loginDetails;
import com.JWT.services.loginServices;
import com.JWT.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class Home {

    @Autowired
    private loginServices service;
    @Autowired
    private service ser;


    @GetMapping("/user")
    public List<user> getUser(){
        return ser.getUsers();
    }

    @PostMapping("/loginUser")
    public loginDetails login(@RequestBody loginDetails login){
        return service.saveLoginDetails(login);

    }


}
