package com.example.lab.demo.flowers;

import com.example.lab.demo.item.Item;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter@AllArgsConstructor@NoArgsConstructor

public class Flower extends Item {

    private double price;
    private double sepalLength;
    private FlowerColor color;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return "It is a flower";
    }
}
