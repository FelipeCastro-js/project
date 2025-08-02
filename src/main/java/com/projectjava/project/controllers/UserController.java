package com.projectjava.project.controllers;

import com.projectjava.project.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1L);
        user1.setFirstName("John");
        user1.setLastName("Doe");
        user1.setEmail("john.doe@example.com");
        user1.setPassword("password123");

        User user2 = new User();
        user2.setId(2L);
        user2.setFirstName("Jane");
        user2.setLastName("Smith");
        user2.setEmail("jane.smith@example.com");
        user2.setPassword("securePass!");

        User user3 = new User();
        user3.setId(3L);
        user3.setFirstName("Bob");
        user3.setLastName("Johnson");
        user3.setEmail("bob.johnson@example.com");
        user3.setPassword("bobSecret");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
