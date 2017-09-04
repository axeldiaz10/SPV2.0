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
     
     private int unidad;
     private double porcentaje;
     private Concepto concepto;

    public LineaLiquidacion() {
    }

    public LineaLiquidacion( int unidad, double porcentaje, Concepto concepto) {
        
        this.unidad = unidad;
        this.porcentaje = porcentaje;
        this.concepto = concepto;
    }
        
    public int getUnidad() {
        return unidad;
    }

    

    public void setUnidad(int unidad) {
        this.unidad = unidad;
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
        return "LineaLiquidacion{"  +  ", unidad=" + unidad + ", porcentaje=" + porcentaje + ", concepto=" + concepto + '}';
    }

    
    
     
     
}
