package com.company;
import Classes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Autor autor=new Autor("Joshua","Bloch","joshua@email.com",'M');
        Libro libro=new Libro("Effective Java",450,150);

                    libro.cargarAutor(autor);
                    System.out.println(libro);
                    System.out.println("\nAumente el stock sumando:  ");
                    libro.modificarStock();
                    System.out.println(libro);
                    System.out.println("\n----------------------------------------");
                    System.out.println("Aumente el precio del libro:  ");
                    libro.modificarPrecio(scan.nextDouble());
                    System.out.println(libro);
                    System.out.println("\n----------------------------------------");
                    System.out.println("Agregar autor nuevo: ");
                    libro.agregarAutor();

        }
    }
