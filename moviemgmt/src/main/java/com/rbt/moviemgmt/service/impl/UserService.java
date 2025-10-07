package com.rbt.moviemgmt.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rbt.moviemgmt.dto.User;
import com.rbt.moviemgmt.exception.UserNotFoundException;

@Service
public class UserService {
    private Map<Long, User> users = new HashMap<>();

    public UserService() {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("John Doe");
        user1.setEmail("john.doe@example.com");
        users.put(1L, user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Jane Doe");
        user2.setEmail("jane.doe@example.com");
        users.put(2L, user2);
    }

    public User getUser(Long id) {
        User user = users.get(id);
        if (user == null) {
            throw new UserNotFoundException(1001, "User not found", HttpStatus.NOT_FOUND);
        }
        return user;
    }

    public User createUser(User user) {
        Long id = (long) (users.size() + 1);
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public User updateUser(Long id, User user) {
        User existingUser = users.get(id);
        if (existingUser == null) {
            throw new UserNotFoundException(1001, "User not found", HttpStatus.NOT_FOUND);
        }
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return existingUser;
    }

    public void deleteUser(Long id) {
        User user = users.get(id);
        if (user == null) {
            throw new UserNotFoundException(1001, "User not found", HttpStatus.NOT_FOUND);
        }
        users.remove(id);
    }
}