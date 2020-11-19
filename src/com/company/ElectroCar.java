package com.company;

public class ElectroCar extends Car {

    private int batteryCapacity;

    public ElectroCar(String name, int weight, double maxspeed, String color, int batteryCapacity) {
        super(name, weight, maxspeed, color);
        this.batteryCapacity = batteryCapacity;
    }

    ElectroCar () {

    }

    public ElectroCar(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {


        return "ElectroCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", maxspeed=" + maxspeed +
                ", color='" + color + '\'' +
                '}';
    }
}
