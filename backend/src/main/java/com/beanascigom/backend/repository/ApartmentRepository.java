package com.beanascigom.backend.repository;

import com.beanascigom.backend.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    List<Apartment> getApartmentsByProperty_Id(Long id);
}
