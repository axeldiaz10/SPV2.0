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
public class Proveedor {
    private String razonSocial;
    private String cuit;
    private Domicilio domicilio;

    public Proveedor() {
    }

    public Proveedor(String razonSocial, String cuit, Domicilio domicilio) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.domicilio = domicilio;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "razonSocial=" + razonSocial + ", cuit=" + cuit + ", domicilio=" + domicilio + '}';
    }
    
    
    
    
}
