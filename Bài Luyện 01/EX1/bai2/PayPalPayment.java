package com.mycompany.javaassignment;

public class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " bang PayPal");
    }
}