package com.ankit.gateway.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentFallback(){
        return Mono.just("Payment service taking to much time to process or payment service is down!!please try again");
    }
    @RequestMapping("/orderFallback")
    public Mono<String> orderFallback(){
        return Mono.just("Order service taking to much time to process or order service is down!!please try again");
    }
}
