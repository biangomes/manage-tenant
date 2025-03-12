package com.beanascigom.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Rent implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long numberOfContract;
  @OneToOne
  private Apartment apartment;
  @OneToMany(mappedBy = "rent")
  private List<Tenant> tenant;
  private BigDecimal rentalValue;
  private LocalDateTime paymentDate;
  private int rentalTime;
  @Column(name = "active")
  private boolean isActive;
//  private LocalDateTime createdA

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getNumberOfContract() {
    return numberOfContract;
  }

  public void setNumberOfContract(Long numberOfContract) {
    this.numberOfContract = numberOfContract;
  }

  public Apartment getApartment() {
    return apartment;
  }

  public void setApartment(Apartment apartment) {
    this.apartment = apartment;
  }

  public BigDecimal getRentalValue() {
    return rentalValue;
  }

  public void setRentalValue(BigDecimal rentalValue) {
    this.rentalValue = rentalValue;
  }

  public LocalDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(LocalDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public int getRentalTime() {
    return rentalTime;
  }

  public void setRentalTime(int rentalTime) {
    this.rentalTime = rentalTime;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public void setTenant(List<Tenant> tenant) {
    this.tenant = tenant;
  }
}
