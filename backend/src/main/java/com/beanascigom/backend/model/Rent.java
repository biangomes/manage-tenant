package com.beanascigom.backend.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Rent {
  private Long id;
  private Long numberOfContract;
  private Apartment apartment;
  private Tenant tenant;
  private BigDecimal rentalValue;
  private LocalDateTime paymentDate;
  private int rentalTime;
}
