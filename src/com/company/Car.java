package com.company;

public class Car {
    protected String name;
    protected int weight;
    protected double maxspeed;
    protected String color;
    public static int wheels = 4;



    Car() {

    }

    Car(String name, int weight, double maxspeed, String color) {
        this.name = name;
        this.weight = weight;
        this.maxspeed = maxspeed;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
