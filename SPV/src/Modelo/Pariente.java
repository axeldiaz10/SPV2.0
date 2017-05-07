/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Axel y Ampy
 */
public class Pariente {
    private int dni;
    private String nombre;
    private String apellido;
    private Parentezco parentezco;

    public Pariente() {
    }

    public Pariente(int dni, String nombre, String apellido, Parentezco parentezco) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.parentezco = parentezco;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public Parentezco getParentezco() {
        return parentezco;
    }

    public void setParentezco(Parentezco parentezco) {
        this.parentezco = parentezco;
    }

    @Override
    public String toString() {
        return "Pariente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", parentezco=" + parentezco + '}';
    }
    
    
}
