package Utiles;

public class Instrumento {


    private int damage;
    private int durabilidad;
    private int resistencia;
    private String nombre;

    public Instrumento(int damage, int durabilidad, int resistencia, String nombre){
        this.damage = damage;
        this.durabilidad = durabilidad;
        this.resistencia = resistencia;
        this.nombre = nombre;
    }

    /**--Get&Set--*/
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**--Methods--*/

    public static void mejorarObjeto(){

    }

    public static void brokenObjeto(){

    }

    public static void usarObjeto(){

    }

}
