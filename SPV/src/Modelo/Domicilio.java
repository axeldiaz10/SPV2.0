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
public class Domicilio {
    private String calle;
    private int numero;
    private int piso;
    private int departamento;
    private Ciudad ciudad;

    public Domicilio(String calle, int numero, int piso, int departamento, Ciudad ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public Domicilio() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", departamento=" + departamento + ", ciudad=" + ciudad + '}';
    }
    
}
