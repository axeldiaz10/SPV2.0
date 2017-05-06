/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Axel y Ampy
 */
public class Provincia {
    private String nombre;
    private ArrayList conjCiudad = new ArrayList<Ciudad>();

    public Provincia() {
    }

    public Provincia(String nombre, ArrayList conjCiudad) {
        this.nombre = nombre;
        this.conjCiudad = conjCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregar (Ciudad c){
        conjCiudad.add(c);
    }
}
