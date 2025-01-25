package com.beanascigom.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Property {
  private Long id;
  private String name;
  private String street;
  private String number;
  private String neighborhood;
  private String cep;
  private String city;
  private String state;
  private Double buildArea;
  private String description;
}
