package com.mycompany.javaassignment;

public class MainPayment {

    public static void main(String[] args) {

        Payment p1 = PaymentFactory.createPayment("credit");
        p1.pay(100);

        Payment p2 = PaymentFactory.createPayment("paypal");
        p2.pay(200);

        Payment p3 = PaymentFactory.createPayment("cash");
        p3.pay(50);
    }
}