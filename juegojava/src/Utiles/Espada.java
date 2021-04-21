package Utiles;

public class Espada extends Instrumento implements Arma{

    public  Espada(int damage, int durabilidad, int resistencia, String nombre){
        super(damage, durabilidad, resistencia, nombre);
    }


    @Override
    public int atacar() {
        return 0;
    }
}
