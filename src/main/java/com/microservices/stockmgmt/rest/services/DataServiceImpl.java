package com.microservices.stockmgmt.rest.services;

import com.microservices.stockmgmt.rest.domain.Item;
import com.microservices.stockmgmt.rest.domain.ItemRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class DataServiceImpl implements DataService{

    @Autowired
    ItemRepo itemRepo;

    @Override
    public List<Item> getAllItems(){
        log.info("get all items called ");
        return itemRepo.findAll();
    }
}
