package com.microservices.usermgmt.rest.services;


import com.microservices.usermgmt.rest.domain.User;

import java.util.List;

public interface UserDataService {

    List<User> getAllUser();

}

