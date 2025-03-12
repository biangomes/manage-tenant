package com.beanascigom.backend.repository;

import com.beanascigom.backend.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface TenantRepository extends JpaRepository<Tenant, Long> {
    List<String> findAllByName(String name);

    @Query(value = "select t.* from tenant t where t.salary >= :minSalary and t.salary <= :maxSalary", nativeQuery = true)
    List<Tenant> findAllBySalaryBetween(BigDecimal minSalary, BigDecimal maxSalary);
}
