package com.ankit.payment.api.controller;

import com.ankit.payment.api.model.Payment;
import com.ankit.payment.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment payNow(@RequestBody Payment payment){
        return paymentService.doPayment(payment);
    }
    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOderId(@PathVariable Integer orderId){
        return paymentService.findPaymentHistoryByOderId(orderId);
    }
}
