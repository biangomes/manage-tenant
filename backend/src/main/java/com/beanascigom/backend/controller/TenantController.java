package com.beanascigom.backend.controller;

import com.beanascigom.backend.model.Tenant;
import com.beanascigom.backend.services.TenantService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "manage-tenant/", produces = "application/json")
public class TenantController {

    @Autowired
    private TenantService service;
    private static final Logger logger = LoggerFactory.getLogger(TenantController.class);

    @GetMapping("v1/salary")
    public ResponseEntity<List<Tenant>> filteringSalary(@RequestParam BigDecimal minSalary, @RequestParam BigDecimal maxSalary) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        var tenants = service.getTenantsWithSalaryBetweenTwoValues(minSalary, maxSalary);
        String json = objectMapper.writeValueAsString(tenants);
        logger.info("Tenants: " + tenants);
        return new ResponseEntity<>(tenants, HttpStatus.OK);
    }

}
