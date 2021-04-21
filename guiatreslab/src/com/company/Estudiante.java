package com.company;

public class Estudiante extends Persona{

    private String carrera;
    private String anio_ingreso;
    private double cuotaMensual;

    public Estudiante(String carrera, String anio_ingreso, double cuotaMensual,String nombre, String apellido, String direccion, String mail, String dni){
        super(nombre, apellido, direccion, mail, dni);
        this.carrera = carrera;
        this.anio_ingreso = anio_ingreso;
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(String anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }



    @Override
    public String toString(){
        final StringBuilder mostrar = new StringBuilder("\nEstudiante: ");
        mostrar.append("'").append(getNombre()).append("' ");
        mostrar.append("'").append(getApellido()).append("' ");
        mostrar.append(" Direccion [").append(getDireccion()).append("] ");
        mostrar.append("Mail '").append(getMail()).append("' ");
        mostrar.append("DNI ").append(getDni()).append(" ");
        mostrar.append("Carrera '").append(getCarrera()).append("' ");
        mostrar.append("Ingreso el '").append(getAnio_ingreso()).append("' ");
        mostrar.append(" Cuota de '$").append(getCuotaMensual()).append("' por mes");

        return mostrar.toString();
    }

}