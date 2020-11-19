package com.company;

public abstract class Animal {
    private String type;
    abstract void getSound();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
