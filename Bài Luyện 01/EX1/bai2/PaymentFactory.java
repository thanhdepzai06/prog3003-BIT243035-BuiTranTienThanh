package com.mycompany.javaassignment;

public class PaymentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } 
        else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } 
        else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();
        }

        throw new IllegalArgumentException("Loai thanh toan khong hop le");
    }
}