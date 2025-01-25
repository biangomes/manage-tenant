package com.beanascigom.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Rent implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long numberOfContract;
  private Apartment apartment;
  private Tenant tenant;
  private BigDecimal rentalValue;
  private LocalDateTime paymentDate;
  private int rentalTime;
}
