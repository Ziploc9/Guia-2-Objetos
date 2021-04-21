package com.company;

public class Staff extends Persona{

    private double sueldo;
    private String turno;

    public Staff(String nombre, String apellido, String direccion, String mail, String dni, double sueldo, String turno){
        super(nombre, apellido, direccion, mail, dni);
        this.sueldo = sueldo;
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double sueldoAnual(){

        double anual;
        return anual = this.getSueldo() * 12;
    }

    @Override
    public String toString(){
        final StringBuilder mostrar = new StringBuilder("\nStaffs escuela: ");
        mostrar.append("'").append(getNombre()).append("' ");
        mostrar.append("'").append(getApellido()).append("' ");
        mostrar.append(" Direccion [").append(getDireccion()).append("] ");
        mostrar.append("Mail '").append(getMail()).append("' ");
        mostrar.append("DNI ").append(getDni()).append(" ");
        mostrar.append("Sueldo '$").append(getSueldo()).append("' ");
        mostrar.append("Turno '").append(getTurno()).append("' ");
        mostrar.append("Sueldo anual '$").append(sueldoAnual()).append("'.");

        return mostrar.toString();
    }


}
