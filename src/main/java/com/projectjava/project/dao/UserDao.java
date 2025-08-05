package com.projectjava.project.dao;

import com.projectjava.project.models.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    void Delete(Long id);
    void Register(User user);
    User validateEmail(User user);
}
