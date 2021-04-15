package com.company;

import java.util.UUID;

public class CuentaBancaria { ///Punto 3

    private final UUID id = UUID.randomUUID();

    private double balance;
    protected ClienteB clie;
    protected double limite = 0;

    public CuentaBancaria(ClienteB clie, double balance) {
        this.balance = balance;
        this.clie = clie;
    }

    public CuentaBancaria(ClienteB clie){
        this(clie,0);
    }

    public void deposito (double cant){
        if (cant > 1) {
            balance += cant;
            System.out.println("   -Depositados $" + cant + ", balance actual: $" + balance);
        }else System.out.println("   -No se puede realizar la operacion, cantidad no permitida");

    }

    public void extraccion (double cant) {

        if (balance - cant >= limite){
            balance -= cant;
            System.out.println("   -Extraidos $" +cant+ ", balance actual: $" + balance);
        }else System.out.println("   -No se puede realizar la operacion, balance insuficiente");

    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteB getClie() {
        return clie;
    }
    public void setClie(ClienteB clie) {
        this.clie = clie;
    }

}

class CuentaBancariaEX extends CuentaBancaria{

    private final double limite = -2000;

    public CuentaBancariaEX(ClienteB clie, double balance) {
        super(clie, balance);
        super.limite = this.limite;
    }

    public CuentaBancariaEX(ClienteB clie) {
        super(clie);
        super.limite = this.limite;
    }
}

