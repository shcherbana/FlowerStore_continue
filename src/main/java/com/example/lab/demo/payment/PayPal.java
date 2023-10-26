package com.example.lab.demo.payment;
public class PayPal implements Payment {
    @Override

    public double pay(double price) {
        return price;
    }
}
