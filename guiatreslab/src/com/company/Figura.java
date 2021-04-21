package com.company;

public abstract class Figura {

    private String color;

    public Figura(String color){
        this.color = color;
    }

    protected Figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double perimetro();

    public abstract double area();
}
