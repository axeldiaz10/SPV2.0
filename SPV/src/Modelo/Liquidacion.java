/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Axel y Ampy
 */
public class Liquidacion {
    private double sueldoNeto;
    private Date fecha;
    private ArrayList conjLineaLiquidacion = new ArrayList<LineaLiquidacion>();

    public Liquidacion() {
    }

    public Liquidacion(double sueldoNeto, Date fecha) {
        this.sueldoNeto = sueldoNeto;
        this.fecha = fecha;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList getConjLineaLiquidacion() {
        return conjLineaLiquidacion;
    }

    public void setConjLineaLiquidacion(ArrayList conjLineaLiquidacion) {
        this.conjLineaLiquidacion = conjLineaLiquidacion;
    }

    @Override
    public String toString() {
        return "Liquidacion{" + "sueldoNeto=" + sueldoNeto + ", fecha=" + fecha + ", conjLineaLiquidacion=" + conjLineaLiquidacion + '}';
    }
   
    public void agregar (LineaLiquidacion ll){
        conjLineaLiquidacion.add(ll);
    }
    
}
