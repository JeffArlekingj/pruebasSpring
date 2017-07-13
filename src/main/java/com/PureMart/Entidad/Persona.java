package com.PureMart.Entidad;

/**
 * Created by Jeff on 12/07/2017.
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido_nombre;
    private String apellido_paterno;

    public Persona(String dni, String nombre, String apellido_nombre, String apellido_paterno) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido_nombre = apellido_nombre;
        this.apellido_paterno = apellido_paterno;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_nombre() {
        return apellido_nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido_nombre(String apellido_nombre) {
        this.apellido_nombre = apellido_nombre;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    
    
}
