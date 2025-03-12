package com.beanascigom.backend.model.dto;

import com.beanascigom.backend.model.Property;

import java.io.Serializable;

public class ApartmentDTO implements Serializable {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private Long property;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Long getProperty() {
        return property;
    }

    public void setProperty(Long property) {
        this.property = property;
    }
}
