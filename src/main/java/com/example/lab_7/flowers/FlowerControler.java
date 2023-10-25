package com.example.lab_7.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/flower")
public class FlowerControler {
    @GetMapping("/hello")
    public String get_Hello(){
        return "Helo";
    }
    @GetMapping("/list")
//    public  Flower get_Flower(){
//        return new Flower(50,8, FlowerColor.RED);
//    }
    public List<Flower> getFlower(){
        return List.of(new Flower(50,8, FlowerColor.RED));
    }
}
