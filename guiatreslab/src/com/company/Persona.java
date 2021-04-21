package com.company;

public class Persona{
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String mail;

    public Persona(String nombre, String apellido, String direccion, String mail, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }




}
