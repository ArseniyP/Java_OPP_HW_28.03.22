package com.phoenix;

public class SportCar extends Car{

    SportCar(String manufacturer, String model, String color){
        super(manufacturer, model);
        this.color = color;
    }

    @Override
    public void setWeight(int weight) {
        if(weight > 3000)
            type = "No sport";
        else
            type = "Sport";
        this.weight = weight;
    }

    @Override
    public void setMaxSpeed(int speed) {
        if(speed < 150)
            type = "No sport";
        else
            type = "Sport";
        this.maxSpeed = speed;
    }
}
