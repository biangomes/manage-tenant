package com.beanascigom.backend.services;

import com.beanascigom.backend.model.Tenant;
import com.beanascigom.backend.model.dto.TenantDTO;
import com.beanascigom.backend.repository.TenantRepository;
import jakarta.persistence.EntityNotFoundException;
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
        return repo.findAllBySalaryBetween(minSalary, maxSalary);
    }

    public TenantDTO getContractByTenant(Long tenantId) {
        var tenant = repo.findById(tenantId).orElseThrow(() -> new EntityNotFoundException("No tenant with ID " + tenantId));

    }
}
