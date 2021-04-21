package Utiles;

public class Pico extends Instrumento implements Arma{

    public Pico(int damage, int durabilidad, int resistencia, String nombre){
        super(damage, durabilidad, resistencia, nombre);
    }

    @Override
    public int atacar(){
        return 0;
    }
}
