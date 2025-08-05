package com.projectjava.project.controllers;

import com.projectjava.project.dao.UserDao;
import com.projectjava.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String loginUser(@RequestBody User user){
        if(userDao.validateEmail(user)){
            return "OK";
        }else {
            return "FAIL";
        }
    }
}
