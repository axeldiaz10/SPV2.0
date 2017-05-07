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
public class Venta {
    private double montoTotal;
    private Date fecha;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(double montoTotal, Date fecha, Cliente cliente) {
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "montoTotal=" + montoTotal + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }
    
    
}
