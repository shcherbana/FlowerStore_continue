package com.example.lab_7.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor colour;
}
