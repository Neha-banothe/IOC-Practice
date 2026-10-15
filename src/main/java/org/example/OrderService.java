package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    //DEPENDENCY INJECTION BY FEILD
//@Autowired
    private  PaymentService p1;


//    @Autowired
//     DEPENDECY INJECTION THROUGH CONSTRUCTOR
    public OrderService ( PaymentService p1)
    {
        this.p1=p1;
    }

    // dependency INJECTION THROUGH SETTER MEHTOD
//    @Autowired
    public void setPaymentService(PaymentService p1)
    {
        this.p1 = p1;
    }
void placeOrder()
{
   p1.pay();

    System.out.println("order placed");
}
}
