package com.example.lab_7.delivery;
import com.example.lab_7.flowers.FlowerBucket;
import java.util.List;

public class PostDelivery implements Delivery{
    @Override
    public String deliver(List<FlowerBucket> items) {
        return "Delivered - with post";
    }
}