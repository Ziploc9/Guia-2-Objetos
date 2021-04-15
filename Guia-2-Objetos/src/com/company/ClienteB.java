package com.company;

import java.util.UUID;

public class ClienteB { ///Punto 3

    private final UUID id = UUID.randomUUID();

    private String nombre;
    private char genero;

    public ClienteB(String nombre, char genero) {
        this.nombre = nombre;

        if (genero == 'M' || genero == 'F') this.genero = genero;
        else if (genero == 'm') this.genero = 'M';
        else if (genero == 'f') this.genero = 'F';
        else this.genero = '?';

    }

    public void MostrarClienteB (){

        System.out.println("Cuenta[id= " + id.toString()
                         + " ,nombre= "  + nombre
                         + " ,genero= "  + genero
                         + "]"
        );
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public UUID getId() { return id; }
}

