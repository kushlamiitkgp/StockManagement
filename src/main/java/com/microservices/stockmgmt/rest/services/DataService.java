package com.microservices.stockmgmt.rest.services;


import com.microservices.stockmgmt.rest.domain.Item;

import java.util.List;

public interface DataService {

    List<Item> getAllItems();

}

