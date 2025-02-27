package com.beanascigom.backend.services;

import com.beanascigom.backend.model.Apartment;
import com.beanascigom.backend.model.Property;
import com.beanascigom.backend.model.dto.ApartmentDTO;
import com.beanascigom.backend.repository.ApartmentRepository;
import com.beanascigom.backend.repository.PropertyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository repository;
    @Autowired
    private PropertyRepository propertyRepo;

    public List<ApartmentDTO> getAllApartmentsByPropertyId(Long propertyId) {
        Optional<Property> property = propertyRepo.findById(propertyId);

        if (property.isEmpty()) {
            throw new EntityNotFoundException("Propriedade não encontrada");
        }

        return null;
    }

    public void create(ApartmentDTO dto) {
        Apartment apartment = new Apartment();
        Optional<Property> property = propertyRepo.findById(dto.getProperty());

        if (property.isEmpty()) {
            throw new EntityNotFoundException("Não é possível salvar apartamento sem propriedade vinculada");
        }
        apartment.setProperty(property.get());
        apartment.setNumberOfBathrooms(dto.getNumberOfBathrooms());
        apartment.setNumberOfRooms(dto.getNumberOfRooms());
        repository.save(apartment);
    }

}
