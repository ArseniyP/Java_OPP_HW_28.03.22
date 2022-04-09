package com.phoenix;

public class MilitaryCar extends Car{

    MilitaryCar(String manufacturer, String model){
        super(manufacturer, model);
        this.color = "Khaki";
    }

    @Override
    public void setWeight(int weight) {
        if(weight < 4000)
            type = "Operating machine";
        else
            type = "Elephant";
        this.weight = weight;

    }

    @Override
    public void setMaxSpeed(int speed) {
        if(speed > 90)
            type = "Operating machine";
        else
            type = "Elephant";
        this.maxSpeed = speed;
    }
}
