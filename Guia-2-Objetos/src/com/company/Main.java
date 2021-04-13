package com.company;

public class Main {

    public static void main(String[] args) {

        Cliente dude = new Cliente();
        dude.setNombre("Tomas Parant");
        dude.setEmail("tomasparant@hotmail.com");
        dude.setDesc(10);

        dude.mostrarCliente();

        Factura factu = new Factura(dude,1500);

        factu.mostrarFactura();

    }
}
