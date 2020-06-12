package com.ankit.order.api.controller;


import com.ankit.order.api.dto.TransactionRequest;
import com.ankit.order.api.response.TransactionResponse;
import com.ankit.order.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/doOrder")
    public TransactionResponse saveOrder(@RequestBody TransactionRequest request) {
        return orderService.doOrder(request);
    }
}
