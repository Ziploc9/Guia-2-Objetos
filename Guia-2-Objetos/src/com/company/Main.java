package com.company;

public class Main {

    public static void main(String[] args) {
/*      // punto 2
        Cliente dude = new Cliente();
        dude.setNombre("Tomas Parant");
        dude.setEmail("tomasparant@hotmail.com");
        dude.setDesc(10);

        dude.mostrarCliente();

        Factura factu = new Factura(dude);

        factu.agregarItem(new ItemVenta("Chocolates Z","ricos",10.0));
        factu.agregarItem(new ItemVenta("Pasteles X","no tan ricos",35.0));
        factu.agregarItem(new ItemVenta("Empanadas P","eh, zafan",60.0));
        //Esta funcion muestra la info de la factura
        factu.mostrarFactura();

 */
        // punto 3
        ClienteB dudette = new ClienteB("Shermie",'f');
        dudette.MostrarClienteB();

        CuentaBancariaEX cuentin = new CuentaBancariaEX(dudette);

        cuentin.deposito(1000);
        cuentin.extraccion(3000);


    }
}
