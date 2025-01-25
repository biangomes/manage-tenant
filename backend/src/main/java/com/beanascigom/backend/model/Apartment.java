package com.beanascigom.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Apartment {
  private Long id;
  private int numberOfRooms;
  private int numberOfBathrooms;
  private Property property;
}
