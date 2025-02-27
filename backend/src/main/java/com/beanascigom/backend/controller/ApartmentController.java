package com.beanascigom.backend.controller;

import com.beanascigom.backend.model.Apartment;
import com.beanascigom.backend.model.dto.ApartmentDTO;
import com.beanascigom.backend.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("manage-tenant/")
public class ApartmentController {
    @Autowired
    private ApartmentService service;

    @GetMapping("v1/apartment")
    public ResponseEntity<List<Apartment>> getAllApartment() {
        return new ResponseEntity<>(service.getAllApartment(), HttpStatus.OK);
    }

    @PostMapping("v1/apartment")
    public ResponseEntity<Object> createApartment(@RequestBody ApartmentDTO dto) {
        service.create(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
