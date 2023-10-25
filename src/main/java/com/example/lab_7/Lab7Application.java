package com.example.lab_7;

import com.example.lab_7.flowers.Flower;
import com.example.lab_7.flowers.FlowerColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class Lab7Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab7Application.class, args);
    }

//    @GetMapping("/hello")
//    public String get_Hello(){
//        return "Helo";
//    }
//    @GetMapping("/flower")
////    public  Flower get_Flower(){
////        return new Flower(50,8, FlowerColor.RED);
////    }
//    public List<Flower> getFlower(){
//        return List.of(new Flower(50,8, FlowerColor.RED));
//    }
}
