/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spv;

import Modelo.Concepto;
import Modelo.Domicilio;
import Modelo.Empleado;
import Modelo.LineaLiquidacion;
import Modelo.Liquidacion;
import Modelo.Localidad;
import Modelo.Provincia;
import Modelo.Turno;
import Modelo.Usuario;

/**
 *
 * @author Axel y Ampy
 */
public class SPV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u1 = new Usuario("admin", "1234", "administrador");
        Usuario u2 = new Usuario("vend", "1234", "vendedor");
        
        Concepto c1 = new Concepto(111, "sueldo basico", 1500.00, "haber");
        Concepto c2 = new Concepto(112, "bonus", 500.00, "haber");
        Concepto c3 = new Concepto(113, "obra social", 300.00, "debe");
        
        LineaLiquidacion ll1 = new LineaLiquidacion(1, 100.00, c1);
        LineaLiquidacion ll2 = new LineaLiquidacion(1, 100.00, c2);
        LineaLiquidacion ll3 = new LineaLiquidacion(1, 100.00, c3);
        
        Liquidacion l1 = new Liquidacion();
        l1.agregar(ll1);
        l1.agregar(ll2);
        l1.agregar(ll3);
        
        Turno t1 = new Turno();
        
        Localidad l = new Localidad("san miguel de tucuman", 4000);
        
        Provincia p = new Provincia("tucuman");
        p.agregar(l);
        
        Domicilio d = new Domicilio("salta", 400, 0, 0, l);
        
        Empleado e = new Empleado(100, "juan", "messi", "juan@gmail.com", 35200000, null, null, d, u1, l1, t1);
        
        
    }
    
}
