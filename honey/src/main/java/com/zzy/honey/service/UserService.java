package com.zzy.honey.service;


import com.zzy.honey.dao.UserDao;
import com.zzy.honey.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public User findUserById(String id){
        return userDao.findUserById(id);
    }
}
