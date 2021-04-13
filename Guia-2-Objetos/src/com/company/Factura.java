package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {

    private final UUID idFactu = UUID.randomUUID();
    private final LocalDate fecha = LocalDate.now();

    private double montoTotal;
    private Cliente clie;

    public Factura (Cliente c, double m){

        montoTotal = m;
        clie = c;

    }

    private double descuento (){

        double descu = (montoTotal * clie.getDesc()) / 100;

        return montoTotal-descu;
    }

    public void mostrarFactura (){
        System.out.println("");
        System.out.print("Factura[id= "+ idFactu.toString()
                            + ", fecha= "+ fecha.toString()
                            + ", monto= $"+ montoTotal
                            + ", monto desc= $"+ descuento()
                            + ", "
        );
        clie.mostrarCliente();
        System.out.print("]\n");
    }


}
