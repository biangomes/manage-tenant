package com.beanascigom.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Apartment implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int numberOfRooms;
  private int numberOfBathrooms;
  @ManyToOne
  @JoinColumn(name = "property_id", nullable = false)
  private Property property;
}
