package Consumibles;

public class Recurso {

    private String nombre;
    private int resistencia;
    private boolean estado;
    private int tiempoMadurez;

    /**--GET&SET--*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTiempoMadurez() {
        return tiempoMadurez;
    }

    public void setTiempoMadurez(int tiempoMadurez) {
        this.tiempoMadurez = tiempoMadurez;
    }

    /**--Methods--*/

    public static void existir(){

    }

    public static void recolectarRecursos(){

    }

    public static void explotarRecursos(){

    }

    public static void reiniciarRecurso(){

    }
}
