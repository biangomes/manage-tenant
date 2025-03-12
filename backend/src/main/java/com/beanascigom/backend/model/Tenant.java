package com.beanascigom.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
public class Tenant implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String phone;
  private String documentNumber;
  private String email;
  private String job;
  private BigDecimal salary;
//  private BankData bankData;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDateTime birth;
  @ManyToOne
  @JoinColumn(name = "rent_id")
  private Rent rent;
  @CreationTimestamp
  private LocalDateTime createdAt;
  @UpdateTimestamp
  private LocalDateTime updatedAt;

  public Tenant() {}

  public Tenant(Long id, String name, String phone, String documentNumber, String email, String job, BigDecimal salary, LocalDateTime birth) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.documentNumber = documentNumber;
    this.email = email;
    this.job = job;
    this.salary = salary;
    this.birth = birth;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public LocalDateTime getBirth() {
    return birth;
  }

  public void setBirth(LocalDateTime birth) {
    this.birth = birth;
  }

  public Rent getRent() {
    return rent;
  }

  public void setRent(Rent rent) {
    this.rent = rent;
  }
}
