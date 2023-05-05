package com.microservices.usermgmt.rest.controller;

import com.microservices.usermgmt.rest.domain.User;
import com.microservices.usermgmt.rest.services.UserDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    UserDataService userDataService;

    @RequestMapping(method = RequestMethod.GET, value = "/all"/*, consumes =*/ )
    public HttpEntity<List<User>> getAllUsersInDatabase(){

        log.info("getAllUsersInDatabase items called ");
        return new HttpEntity<>(userDataService.getAllUser());
    }
}
