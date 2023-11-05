package com.example.lab.demo;

import com.example.lab.demo.delivery.PostDelivery;
import com.example.lab.demo.flowers.Flower;
import com.example.lab.demo.flowers.FlowerColor;
import com.example.lab.demo.item.Item;
import com.example.lab.demo.delivery.DHLDelivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class DeliveryTests {
    private List<Item> client;
    private final double price = 100;
    private PostDelivery deliveryPost;
    private DHLDelivery deliveryDHL;

    @BeforeEach
    public void init() {

        deliveryPost = new PostDelivery();
        deliveryDHL = new DHLDelivery();

        client = List.of(new Flower(price, 0.8, FlowerColor.RED),
                new Flower(price, 0.8, FlowerColor.RED));

    }

    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(client, deliveryPost.deliver(client));
    }
    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(client, deliveryDHL.deliver(client));
    }

}
