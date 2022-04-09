package com.phoenix;

public class Truck extends Car{

    Truck(String manufacturer, String model, String color){
        super(manufacturer, model);
        this.color = color;
    }

    @Override
    public void setWeight(int weight) {
        if(weight < 5000)
            type = "Small truck";
        else
            type = "Heavy truck";
        this.weight = weight;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }
}
