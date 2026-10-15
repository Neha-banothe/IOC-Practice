package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("cp")// change bean name
public class cardPayment implements PaymentService
{
    public void pay()
    {
        System.out.println("paying via card");
    }
}
