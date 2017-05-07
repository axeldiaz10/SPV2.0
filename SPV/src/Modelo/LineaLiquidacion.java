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
public class LineaLiquidacion {
     private int cantidad;
     private double porcentaje;
     private Concepto concepto;

    public LineaLiquidacion() {
    }

    public LineaLiquidacion(int cantidad, double porcentaje, Concepto concepto) {
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
        this.concepto = concepto;
    }
        
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return "LineaLiquidacion{" + "cantidad=" + cantidad + ", porcentaje=" + porcentaje + ", concepto=" + concepto + '}';
    }
     
     
}
