package com.ankit.order.api.service;

import com.ankit.order.api.dto.Payment;
import com.ankit.order.api.dto.TransactionRequest;
import com.ankit.order.api.model.Order;
import com.ankit.order.api.response.TransactionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    private static final String REST_URL="http://PAYMENT-SERVICE/payment/doPayment";

    @Autowired
    private RestTemplate restTemplate;

    public TransactionResponse doOrder(TransactionRequest request){
        String message="";
        Order order= request.getOrder();
        Payment payment=new Payment();
        payment.setOrederId(order.getId());
        payment.setAmount(order.getPrice());
        Payment paymentResponse=restTemplate.postForObject(REST_URL,payment,Payment.class);
        message=paymentResponse.getPaymentStatus().equals("success")?
                "payment successfully completed order is placed":"payment is failed order add to cart";
        return new TransactionResponse(order,paymentResponse.getTransactionId(),
               paymentResponse.getAmount(), message);

    }
}
