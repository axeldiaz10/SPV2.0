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
     private double importe;
     private int unidad;
     private double porcentaje;
     private Concepto concepto;

    public LineaLiquidacion() {
    }

    public LineaLiquidacion(double importe, int unidad, double porcentaje, Concepto concepto) {
        this.importe = importe;
        this.unidad = unidad;
        this.porcentaje = porcentaje;
        this.concepto = concepto;
    }
        
    public int getUnidad() {
        return unidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
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
        return "LineaLiquidacion{" + "importe=" + importe + ", unidad=" + unidad + ", porcentaje=" + porcentaje + ", concepto=" + concepto + '}';
    }

    
    
     
     
}
