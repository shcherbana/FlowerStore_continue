package com.example.lab.demo.flowers;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepo extends JpaRepository<Flower, Integer> {
    List<Flower> findAll();
}
