package com.insurancecore.core.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PolicyCreateRequest {

    private String policyId;
    private String policyType;
    private BigDecimal premiumAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private Long agentId;
}