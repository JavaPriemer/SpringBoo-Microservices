package com.ankit.order.api.response;

import com.ankit.order.api.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    private String transactionId;
    private Integer amount;
    private String response;
}
