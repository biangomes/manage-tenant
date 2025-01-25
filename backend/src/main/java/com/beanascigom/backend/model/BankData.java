package com.beanascigom.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class BankData implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String account;
  private String agency;
  private String bankName;
  private Boolean isCheckingAccount;
  private Boolean isSavingsAccount;
  private Boolean isSalaryAccount;
}
