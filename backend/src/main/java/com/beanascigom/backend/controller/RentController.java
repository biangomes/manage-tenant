package com.beanascigom.backend.controller;

import com.beanascigom.backend.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RentController {
    @Autowired
    private RentService service;


}
