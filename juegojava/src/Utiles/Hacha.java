package Utiles;

public class Hacha extends Instrumento implements Arma{

    public Hacha(int damage, int durabilidad, int resistencia, String nombre){
        super(damage, durabilidad, resistencia, nombre);
    }

    @Override
    public int atacar(){
        return 0;
    }
}
