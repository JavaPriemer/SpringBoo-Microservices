package com.ankit.order.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDER_TB")
@Entity
public class Order implements Serializable {
    private static final long serialVersionUID = -1359788223880871478L;
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer price;
    private Integer quantity;
}
