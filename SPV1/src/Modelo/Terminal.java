/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Axel
 */
public class Terminal {
    private Venta venta;

    public Terminal() {
        venta = new Venta();
    }

    public Terminal(Venta venta) {
        this.venta = venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "Terminal{" + "venta=" + venta + '}';
    }
    
    public void agregarArticuloAVenta(Articulo a, int c){
        venta.agregarArticulo(a,c);
    }

    public double calcularTotal(Articulo a, int cant) {
        return venta.calcularTotalParcial(a,cant);
    }

    double calcularVuelto(double dr) {
        return venta.cacularVuelto(dr);
        
    }

    public Venta obtenerVentaActual() {
        return this.venta;
    }
    
    
    
    
}
