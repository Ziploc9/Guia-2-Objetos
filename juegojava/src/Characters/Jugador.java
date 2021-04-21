package Characters;

public class Jugador extends Personaje {

    private int cansancio;
    private int hambre;

    public Jugador(String nombre, int vida, int damage, int resistencia, double velocidad, int cansancio, int hambre){
        super(nombre,vida,damage,resistencia,velocidad);
        this.cansancio = cansancio;
        this.hambre = hambre;
    }

    /**---Get&Set---*/
    public int getCansancio() {
        return cansancio;
    }

    public void setCansancio(int cansancio) {
        this.cansancio = cansancio;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    /**---Methods---*/

   /* public static boolean dormir(){
        boolean mimir;
        if(KeyListener == "m" || KeyListener == "M"){
            mimir = true;
        }else
        {
            mimir = false;
        }
        return mimir;
    }*/

    public static void agarrarObjeto(){

    }

    public static void recolectar(){

    }

    public static void guardarObjeto(){

    }

    public static void sacarObjeto(){

    }

    public static void verInventario(){

    }

    public static void construir(){

    }

    public static void comer(){

    }

    public static void defenderse(){

    }

    public static void cerrarCasa(){

    }


}
