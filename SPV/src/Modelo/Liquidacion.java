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
    private ArrayList conjConcepto = new ArrayList<Concepto>();

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

    public ArrayList getConjConcepto() {
        return conjConcepto;
    }

    public void setConjConcepto(ArrayList conjConcepto) {
        this.conjConcepto = conjConcepto;
    }

    @Override
    public String toString() {
        return "Liquidacion{" + "sueldoNeto=" + sueldoNeto + ", fecha=" + fecha + ", conjConcepto=" + conjConcepto + '}';
    }
    
    public void agregar (Concepto c){
        conjConcepto.add(c);
    }
    
}
