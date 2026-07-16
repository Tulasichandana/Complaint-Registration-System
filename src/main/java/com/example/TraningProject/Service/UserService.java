package com.example.TraningProject.Service;

import com.example.TraningProject.Entity.User;

import java.util.List;

public interface UserService {

    User registerUser(User user);

    boolean loginUser(String email, String password);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);

    boolean existsByEmail(String email);
}