/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Axel y Ampy
 */
public class Empleado {
    private int legajo;
    private String nombre;
    private String apellido;
    private String correo;
    private int dni;
    private Date fechaIngreso;
    private Date fechaNacimiento;
    private Domicilio domicilio;
    private Usuario usuario;
    private Liquidacion liquidacion;
    private Turno turno;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, String apellido, String correo, int dni, Date fechaIngreso, Date fechaNacimiento, Domicilio domicilio, Usuario usuario, Liquidacion liquidacion, Turno turno) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.usuario = usuario;
        this.liquidacion = liquidacion;
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

   

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Liquidacion getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Liquidacion liquidacion) {
        this.liquidacion = liquidacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", fechaNacimiento=" + fechaNacimiento + ", domicilio=" + domicilio + ", usuario=" + usuario + ", liquidacion=" + liquidacion + ", turno=" + turno + '}';
    }

    
    
    
}
