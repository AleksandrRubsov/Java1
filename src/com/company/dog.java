package com.company;

import java.lang.reflect.InaccessibleObjectException;

public class dog {
    private final String name;
    private final String color;
    private final int weight;

    public dog(String name,String color,int weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public String toString(){
        return "Имя собаки " +  name + "\nЦвет собаки " + color + "\nВес собаки " + weight;

    }

}
