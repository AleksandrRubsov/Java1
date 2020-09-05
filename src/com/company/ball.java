package com.company;

public class ball {
    private final String color;
    private final int diameter;
    private final int weight;

    public ball(String color,int diameter,int weight){
        this.color = color;
        this.diameter = diameter;
        this.weight = weight;

    }
    public String toString(){
        return "Цвет мяча " + color + "\nДиаметр мяча " + diameter + "\nВес мяча " + weight;

    }
}
