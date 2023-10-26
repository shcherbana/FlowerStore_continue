package com.example.lab_7.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
}