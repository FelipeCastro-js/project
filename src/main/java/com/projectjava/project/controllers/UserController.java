package com.projectjava.project.controllers;

import com.projectjava.project.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value= "user/{id}")
    public User getUser(@PathVariable Long id){
        User user = new User();
        user.setId(id);
        user.setFirstName("Felipe");
        user.setLastName("Castro");
        user.setEmail("carloscastro1860@gmail.com");
        user.setCellphone("3188147272");

        return user;
    }
}
