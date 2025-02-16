package com.beanascigom.backend.services;

import com.beanascigom.backend.model.Tenant;
import com.beanascigom.backend.repository.TenantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TenantService {

    @Autowired
    private TenantRepository repo;
    private static final Logger logger = LoggerFactory.getLogger(TenantService.class);

    public List<Tenant> getTenantsWithSalaryBetweenTwoValues(BigDecimal minSalary, BigDecimal maxSalary) {
        logger.info("maxSalary: " + maxSalary + "\nminSalary: " + minSalary);
//        BigDecimal minimum = new BigDecimal(minSalary);
//        BigDecimal maximum = new BigDecimal(maxSalary);
        return repo.findAllBySalaryBetween(minSalary, maxSalary);
    }
}
