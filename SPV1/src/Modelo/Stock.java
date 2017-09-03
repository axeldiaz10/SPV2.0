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
public class Stock {
    private int actual;
    private int minimo;
    private int maximo;
    private int cantidadReponer;
    private String estado;

    public Stock() {
    }

    public Stock(int actual, int minimo, int maximo, int cantidadReponer, String estado) {
        this.actual = actual;
        this.minimo = minimo;
        this.maximo = maximo;
        this.cantidadReponer = cantidadReponer;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getCantidadReponer() {
        return cantidadReponer;
    }

    public void setCantidadReponer(int cantidadReponer) {
        this.cantidadReponer = cantidadReponer;
    }

    @Override
    public String toString() {
        return "Stock{" + "actual=" + actual + ", minimo=" + minimo + ", maximo=" + maximo + ", cantidadReponer=" + cantidadReponer + ", estado=" + estado + '}';
    }

    
}
