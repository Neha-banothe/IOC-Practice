package org.example;

import org.example.payment.PaymentService;
import org.example.payment.cardPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

@Bean
    public user new3()
    {
        return new user("neha",24);
    }

    @Bean
    public cardPayment cardService()
    {
        return new cardPayment() ;
    }

    @Bean
    public OrderService order(PaymentService p1)
    {
        return new OrderService(p1 ) ;
    }
}
