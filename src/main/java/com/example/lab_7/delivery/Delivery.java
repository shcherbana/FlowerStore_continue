package com.example.lab_7.delivery;
import com.example.lab_7.flowers.FlowerBucket;
import java.util.List;

public interface Delivery {
    String deliver(List<FlowerBucket> flowerBuckets);
}