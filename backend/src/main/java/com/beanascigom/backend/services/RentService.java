package com.beanascigom.backend.services;

import com.beanascigom.backend.model.Rent;
import com.beanascigom.backend.repository.ApartmentRepository;
import com.beanascigom.backend.repository.RentRepository;
import com.beanascigom.backend.repository.TenantRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;

@Service
public class RentService {
    @Autowired
    private RentRepository repository;
    @Autowired
    private TenantRepository tenantRepository;
    @Autowired
    private ApartmentRepository apartmentRepository;

    public void create(Long tenantId, Long apartmentId) {
        var apartment = apartmentRepository.findById(apartmentId)
                .orElseThrow(() -> new EntityNotFoundException("Nao existe apartamento com esse ID " + apartmentId));

        if (!apartment.isAvailable()) {
            throw new IllegalArgumentException("Apartamento " + apartmentId + " nao está disponível");
        }

        var tenant = tenantRepository.findById(tenantId)
                .orElseThrow(() -> new EntityNotFoundException("Nao existe inquilino com ID " + tenantId));

        if (tenant.getSalary().compareTo(apartment.getValue()) < 1000.00) {
            throw new IllegalArgumentException("Salario do inquilino é menor que o permitido");
        }

        Rent rent = new Rent();
        rent.setApartment(apartment);
        rent.setTenant(Collections.singletonList(tenant));
        rent.setPaymentDate(LocalDateTime.now().plusDays(30));
        rent.setRentalValue(apartment.getValue());
        repository.save(rent);
    }

}
