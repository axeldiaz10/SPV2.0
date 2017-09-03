/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.SpringLayout;

/**
 *
 * @author Axel y Ampy
 */
public class Venta {
    private ArrayList<LineaVenta> conjLineaVenta = new ArrayList<>();
    
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

    public ArrayList<LineaVenta> getConjLineaVenta() {
        return conjLineaVenta;
    }

    public void setConjLineaVenta(ArrayList<LineaVenta> conjLineaVenta) {
        this.conjLineaVenta = conjLineaVenta;
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
        return "Venta{" + "conjLineaVenta=" + conjLineaVenta + ", montoTotal=" + montoTotal + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }

    public void agregar(LineaVenta lv){
        conjLineaVenta.add(lv);
    }

    public void agregarArticulo (Articulo a, int c){
        LineaVenta lv = new LineaVenta(a,c);
        this.agregar(lv);
        System.out.println("ARTICULOS: " +conjLineaVenta.get(conjLineaVenta.size()-1).getArticulo().getDescripcion());
    }

    public double calcularTotalParcial(Articulo a, int cant) {
        
        this.montoTotal = this.montoTotal + (conjLineaVenta.get(conjLineaVenta.size() -1).getArticulo().getPrecioUnitario()) * (conjLineaVenta.get(conjLineaVenta.size() -1).getCantidad()) ;
        return montoTotal;
    }

    double cacularVuelto(double dr) {
        double v = 0;
        v = dr - this.montoTotal;
        System.out.println("VUELTO: "+v);
        return v;
    }
    
}
