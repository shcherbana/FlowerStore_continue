package com.example.lab.demo.delivery;
import com.example.lab.demo.item.Item;

import java.util.List;

public class PostDelivery implements Delivery {

    @Override
    public List<Item> deliver(List<Item> items) {
        System.out.println("Item was delievered by post");
        return items;
    }
}