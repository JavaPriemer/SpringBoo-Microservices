package com.ankit.order.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Integer paymentId;
    private String paymentStatus;
    private String transactionId;
    private Integer orederId;
    private Integer amount;

}
