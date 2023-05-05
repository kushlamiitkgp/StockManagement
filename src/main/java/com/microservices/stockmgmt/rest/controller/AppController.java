package com.microservices.stockmgmt.rest.controller;

import com.microservices.stockmgmt.rest.domain.Item;
import com.microservices.stockmgmt.rest.services.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//(value = "/app")
@RequestMapping(value = "/app")
@Slf4j
public class AppController {

    @Autowired
    DataService dataService;

    @RequestMapping(method = RequestMethod.GET, value = "/all"/*, consumes =*/ )
    public HttpEntity<List<Item>> getAllItemsInDatabase(){

        log.info("getAllItemsInDatabase items called ");
        return new HttpEntity<>(dataService.getAllItems());
    }
}
