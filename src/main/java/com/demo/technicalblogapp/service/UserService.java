package com.demo.technicalblogapp.service;

import com.demo.technicalblogapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean login(User user) {
        if(user.getUserName().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }

}
