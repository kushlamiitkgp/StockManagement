package com.microservices.usermgmt.rest.services;

import com.microservices.usermgmt.rest.domain.User;
import com.microservices.usermgmt.rest.domain.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class UserDataServiceImpl implements UserDataService{

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAllUser(){
        log.info("get all users called ");
        return userRepo.findAll();
    }
}
