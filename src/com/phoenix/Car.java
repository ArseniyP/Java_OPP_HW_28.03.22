package com.phoenix;

public abstract class Car {
    protected String manufacturer;
    protected String model;
    protected String color;
    protected int maxSpeed;
    protected int weight;
    protected String type;

    public abstract void setWeight(int weight);
    public abstract void setMaxSpeed(int speed);


    Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getName() {
        return manufacturer + " " + model + " " + color;
    }

    public int getWeight() {
        return weight;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
