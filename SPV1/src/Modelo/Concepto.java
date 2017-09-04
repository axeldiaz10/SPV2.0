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
public class Concepto {
    private int codigo;
    private String descripcion;
    private double importe;
    private int unidad;
    private double porcentaje;
    private String tipo;
    private String estado;

    public Concepto() {
    }

    public Concepto(int codigo, String descripcion, double importe, int unidad, double porcentaje, String tipo, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.unidad = unidad;
        this.porcentaje = porcentaje;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

        
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Concepto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + ", unidad=" + unidad + ", porcentaje=" + porcentaje + ", tipo=" + tipo + ", estado=" + estado + '}';
    }

    

    
    
            
    
}
