package com.company;

public class Cuadrad extends Figura{

    private double lado1;
    private double lado2;

    public Cuadrad(String color, double lado1, double lado2){
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrad(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        setColor("sin color");
    }


    @Override
    public double perimetro() {
        double total;
        return total = Math.pow(this.lado1,2) + Math.pow(this.lado2,2);
    }

    @Override
    public double area() {
        double total;
        return total = this.lado1 * this.lado2;
    }

    @Override
    public String toString(){
        StringBuilder show = new StringBuilder(" El Cuadrado tiene ");
        show.append(" base: ").append(this.lado1).append("| ");
        show.append("altura: ").append(this.lado2).append("| ");
        show.append("Color: ").append(getColor()).append("| ");
        show.append("area ").append(area()).append("| ");
        show.append("Perimetro ").append(perimetro()).append("\n");

        return show.toString();
    }
}
