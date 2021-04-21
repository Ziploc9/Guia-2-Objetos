package com.company;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public Circulo(double radio){
        this.radio = radio;
        setColor("sin color");
    }


    @Override
    public double perimetro() {
        double total;
        return total = 2 * Math.PI * this.radio;
    }

    @Override
    public double area() {
       double total;
        return total = Math.PI * Math.pow(this.radio,2);
    }

    @Override
    public String toString(){
        StringBuilder show = new StringBuilder(" El circulo tiene ");
        show.append(" radio: ").append(this.radio).append("| ");
        show.append("Color: ").append(getColor()).append("| ");
        show.append("Area: ").append(area()).append("| ");
        show.append("Perimetro ").append(perimetro()).append(" \n");

        return show.toString();
    }
}
