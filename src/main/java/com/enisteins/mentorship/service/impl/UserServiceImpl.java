package com.enisteins.mentorship.service.impl;

import com.enisteins.mentorship.dao.UserDao;
import com.enisteins.mentorship.model.User;
import com.enisteins.mentorship.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(final Long id) {
        return userDao.findById(id).get();
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(users::add);
        return users;
    }

    public void createUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    public void updateUser(User user) {
        userDao.save(user);
    }
}
