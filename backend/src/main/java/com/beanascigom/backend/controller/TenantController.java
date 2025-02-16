package com.beanascigom.backend.controller;

import com.beanascigom.backend.services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("manage-tenant/")
public class TenantController {

    @Autowired
    private TenantService service;

    @GetMapping("v1/salary")
    public ResponseEntity<Object> filteringSalary(@RequestParam BigDecimal minSalary, @RequestParam BigDecimal maxSalary) {
        var tenants = service.getTenantsWithSalaryBetweenTwoValues(minSalary, maxSalary);
        return new ResponseEntity<>(tenants, HttpStatus.OK);
    }
}
