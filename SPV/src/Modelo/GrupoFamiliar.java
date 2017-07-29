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
public class GrupoFamiliar {
    private ArrayList<Pariente> conjPariente = new ArrayList<>();

    public GrupoFamiliar() {
    }

    public ArrayList getConjPariente() {
        return conjPariente;
    }

    public void setConjPariente(ArrayList conjPariente) {
        this.conjPariente = conjPariente;
    }
    
    public void agregar (Pariente p){
        conjPariente.add(p);
    }
}
