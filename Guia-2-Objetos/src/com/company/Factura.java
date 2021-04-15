package com.company;

import java.time.LocalDate;
import java.util.UUID;
import java.util.Vector;


public class Factura {

    private final UUID idFactu = UUID.randomUUID();
    private final LocalDate fecha = LocalDate.now();
//Es necesario montoTotal? Si se calcula en el momento de mostrar la factura
    private double montoTotal;
    private Cliente clie;

    private Vector<ItemVenta> items = new Vector<>(10,1);


    public Factura(Cliente clie){

        this.clie = clie;
        montoTotal = 0;
    }

    private double descuento (){

        double descu = (montoTotal * clie.getDesc()) / 100;

        return montoTotal-descu;
    }

    public void mostrarFactura (){

        montoTotal = 0;

        items.forEach((n) -> montoTotal+= n.getPrecioU() );

        System.out.print("\nFactura[id= "+ idFactu.toString()
                            + ", fecha= "+ fecha.toString()
                            + ", monto= $"+ montoTotal
                            + ", monto desc= $"+ descuento()
                            + ", "
        );
        clie.mostrarCliente();
        System.out.print("]\n");
    }

    public void agregarItem(ItemVenta item){

        items.add(item);
    }
}
