package com.example.lab.demo.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServices {
    private FlowerRepo flowerRepository;

    @Autowired
    public FlowerServices(FlowerRepo flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return  flowerRepository.findAll();
    }
}