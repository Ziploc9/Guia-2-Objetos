package com.company;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base =base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        setColor("sin color");
    }


    @Override
    public double perimetro() {
        double total;
        return total = Math.pow(this.base,2) + Math.pow(this.altura,2);
    }

    @Override
    public double area() {
        double total;
        return total = this.base * this.altura;
    }

    @Override
    public String toString(){
        StringBuilder show = new StringBuilder(" El rectangulo tiene ");
        show.append(" base: ").append(this.base).append("| ");
        show.append("altura: ").append(this.altura).append("| ");
        show.append("Color: ").append(getColor()).append("| ");
        show.append("area ").append(area()).append("| ");
        show.append("Perimetro ").append(perimetro()).append(" \n");

        return show.toString();
    }
}
