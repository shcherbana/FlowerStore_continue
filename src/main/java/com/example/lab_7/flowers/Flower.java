package com.example.lab_7.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
@Entity
public class Flower {
    @Id
    private double price;
    private double sepalLength;
    private FlowerColor colour;
}
