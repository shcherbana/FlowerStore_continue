package com.example.lab_7.flowers;
import com.fasterxml.jackson.annotation.JsonValue;
public enum FlowerColor {
    RED("red"), WHITE("white"),GREEN("green");
    private String value;
    FlowerColor(String value){
        this.value = value;
    }
    @JsonValue
    public String toString(){
        return value;
    }
}
