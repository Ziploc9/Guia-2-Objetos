package Characters;

import javax.swing.*;

public class Personaje{

    private String nombre;
    private int vida;
    private int damage;
    private int resistencia;
    private double velocidad;

    public Personaje(String nombre, int vida, int damage, int resistencia, double velocidad){
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.resistencia = resistencia;
        this.velocidad = velocidad;

    }

    /**---Get&Set---*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**---Methods---*/
    public static void caminar(String lugar){
        System.out.println("Estas caminando hacia "+lugar);
    }

    public static void atacar(){

    }

    public static void abrircasa(){

    }

}
