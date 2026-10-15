package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class upiPayment implements PaymentService
{
    public void pay()
    {
        System.out.println("paying upi");
    }
}
