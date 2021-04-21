package com.company;

import Characters.*;
import Consumibles.*;
import Utiles.*;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Personaje personaje = new Personaje("Chaldu",500,20,100,2.4);

        crearPersonaje(personaje,scan);
    }

    public static void crearPersonaje(Personaje person,Scanner scan){
        System.out.println("Bienvenido usuario a Farmer Warrior ¿Quiere ponerle un nombre a su personaje? \n Yes | No");
        String option = scan.nextLine();
        if("Yes".equals(option) || "yes".equals(option) || "y".equals(option) || "Y".equals(option)){
            System.out.println("\n Nombre de su personaje: ");
            person.setNombre(scan.nextLine());
        }else{
            System.out.println("\n Bien, seguiremos con esta historia, preparate..");
        }
    }

}