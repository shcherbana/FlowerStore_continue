package com.example.lab.demo;

import com.example.lab.demo.payment.PayPal;
import com.example.lab.demo.payment.CreditCard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PaymentTests {
    private PayPal PayPalPayment;
    private CreditCard CreditCardPayment;
    private final double price = 100;
    @BeforeEach
    public void init() {
        CreditCardPayment = new CreditCard();
        PayPalPayment = new PayPal();
    }
    @Test
    public void testCreditCard() {
        Assertions.assertEquals(price, CreditCardPayment.pay(price));
    }
    @Test
    public void testPayPal() {
        Assertions.assertEquals(price, PayPalPayment.pay(price));
    }
}