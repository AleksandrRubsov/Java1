package com.company;

public class book {
    private final String color;
    private final int numberofpages;
    private final int thickness;

    public book(String color,int numberofpages,int thickness){
        this.color = color;
        this.numberofpages = numberofpages;
        this.thickness = thickness;
    }

    public String toString(){
        return "Цвет книги " + color + "\nКоличество страниц " + numberofpages + "\nТолщина книги " + thickness;

    }

}
