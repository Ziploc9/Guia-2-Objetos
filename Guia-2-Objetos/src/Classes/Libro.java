package Classes;
import java.util.*;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private ArrayList<Autor> autor;

    // ArrayList <elemento> nombre = new ArrayList <elemento>()
    //private ArrayList <Libro> libros = new ArrayList<Libro>();

    public Libro(String titulo, double precio, int stock){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    /**--Methods--*/
    public void modificarPrecio(double precio){
        this.precio = getPrecio() + precio;
    }

    public void modificarStock(){
        Scanner scan = new Scanner(System.in);
        int modStock = Integer.parseInt(scan.nextLine());
        this.stock = getStock() + modStock;
    }

    public ArrayList<Autor> getAutor(){
        return autor;
    }

    public void cargarAutor(Autor autor){
        this.autor.add(autor);
    }

    public String mostrarAutor(){
        String nom = "";
        for (Autor nom1: autor) {
            nom = nom + nom1.getNombre()+""+nom1.getApellido()+" ,";
        }
        return nom;
    }

    public void mostrarLibro(){
        System.out.println("Libro "+getTitulo()+" Autor: "+mostrarAutor()+ " | " + " $" +getPrecio());

    }
    public void mostrarnuevoAutorLibro(ArrayList nombre){
        System.out.println("El Libro {"+getTitulo()+"} de { Nombre: "+nombre+"}. Se vende por $"+getPrecio()+".\n");
    }

    public void agregarAutor(){
        Scanner scan = new Scanner(System.in);
        ArrayList nuevonom = new ArrayList();
        nuevonom.add(scan.nextLine());
        nuevonom.addAll(autor);
        mostrarnuevoAutorLibro(nuevonom);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("El Libro {");
        sb.append(" '").append(titulo).append("'");
        sb.append(", de ").append(autor);
        sb.append(". Se vende por $").append(precio);
        sb.append(", Stock: ").append(stock);
        sb.append('}');
        return sb.toString();
    }
}
