package com.company;

import java.util.UUID;

public class ItemVenta {

    private final UUID id = UUID.randomUUID();

    private String nombre, descrip;
    private Double precioU;

    public ItemVenta(String nombre, String descrip, Double precioU) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.precioU = precioU;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Double getPrecioU() {
        return precioU;
    }
    public void setPrecioU(Double precioU) {
        this.precioU = precioU;
    }


}
