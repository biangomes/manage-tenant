package com.beanascigom.backend.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RentDTO implements Serializable {
    private TenantDTO tenant;
    private ApartmentDTO apartment;
    private BigDecimal rentalValue;
}
