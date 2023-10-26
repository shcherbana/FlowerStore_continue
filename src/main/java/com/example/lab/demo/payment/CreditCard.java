package com.example.lab.demo.payment;

public class CreditCard implements Payment {
    
    @Override
    public double pay(double price) {
        return price;
    }
}
