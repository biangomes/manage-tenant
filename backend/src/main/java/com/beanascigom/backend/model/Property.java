package com.beanascigom.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Property implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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

  @OneToMany(mappedBy = "property")
  private List<Apartment> apartment;
}
