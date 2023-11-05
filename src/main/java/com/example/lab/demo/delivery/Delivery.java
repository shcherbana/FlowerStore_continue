package com.example.lab.demo.delivery;

import java.util.List;

import com.example.lab.demo.item.Item;

public interface Delivery {
    List<Item> deliver(List<Item> items);
}
