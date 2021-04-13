package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Cliente {

    private final UUID id = UUID.randomUUID();

    private String nombre, email;
    private float desc;


    public void mostrarCliente (){

        System.out.print( "Cliente[id= "+id.toString()
                            +", nombre= " + nombre
                            +", email= " + email
                            +", descuento= " + desc + "%]"
        );

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public float getDesc() {
        return desc;
    }
    public void setDesc(float desc) {
        this.desc = desc;
    }
}
