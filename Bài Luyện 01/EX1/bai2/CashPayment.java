package com.mycompany.javaassignment;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " bang Tien Mat");
    }
}