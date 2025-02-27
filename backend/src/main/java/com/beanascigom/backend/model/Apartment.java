package com.beanascigom.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
public class Apartment implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int numberOfRooms;
  private int numberOfBathrooms;
  @ManyToOne
  @JoinColumn(name = "property_id", nullable = false)
  private Property property;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public Property getProperty() {
    return property;
  }

  public void setProperty(Property property) {
    this.property = property;
  }
}
