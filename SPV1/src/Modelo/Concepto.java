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
    
    private String tipo;

    public Concepto() {
    }

    public Concepto(int codigo, String descripcion, String tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        
        this.tipo = tipo;
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
        return "Concepto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", tipo=" + tipo + '}';
    }
    
    
    
            
    
}
