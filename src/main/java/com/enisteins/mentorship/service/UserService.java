package com.enisteins.mentorship.service;

import com.enisteins.mentorship.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUser(Long id);
    List<User> getUsers();
    void createUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}
