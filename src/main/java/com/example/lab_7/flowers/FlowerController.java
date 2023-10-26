package com.example.lab_7.flowers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/flower")
@RestController
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    @GetMapping(path = "/all")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }
    @PostMapping(path = "/add")
    public void addFlower(@RequestBody Flower flower){
        flowerService.addFlower(flower);
    }

}

//@RestController
//@RequestMapping("/api/flower")
//public class FlowerControler {
//    @GetMapping("/hello")
//    public String get_Hello(){
//        return "Helo";
//    }
//    @GetMapping("/list")
////    public  Flower get_Flower(){
////        return new Flower(50,8, FlowerColor.RED);
////    }
//    public List<Flower> getFlower(){
//        return List.of(new Flower(50,8, FlowerColor.RED));
//    }
//}
