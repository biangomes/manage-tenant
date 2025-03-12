package com.beanascigom.backend.repository;

import com.beanascigom.backend.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long> {
}
