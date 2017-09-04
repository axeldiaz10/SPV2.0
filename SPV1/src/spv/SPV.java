/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spv;

import Controlador.Controlador;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.Concepto;
import Modelo.Domicilio;
import Modelo.Empleado;
import Modelo.Empresa;
import Modelo.LineaLiquidacion;
import Modelo.Liquidacion;
import Modelo.Localidad;
import Modelo.Proveedor;
import Modelo.Provincia;
import Modelo.Stock;
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
        
        Localidad l = new Localidad("san miguel de tucuman", 4000);
        
        Provincia p = new Provincia("tucuman");
        p.agregar(l);
        
        Domicilio d = new Domicilio("salta", 400, 0, 0, l);
        
        Stock s1 = new Stock(10, 2, 20, 8, "disponible");
        
        Proveedor p1 = new Proveedor("proveedor SRL", "200011144", d);
        
        Articulo a1 = new Articulo(1, "coca cola", 35.00, s1, p1);
        Articulo a2 = new Articulo(2, "lays", 15.00, s1, p1);
        Articulo a3 = new Articulo(3, "pasta", 40.00, s1, p1);
        
        Concepto c1 = new Concepto(111, "sueldo basico", 6000, 1, 0, "haber", "Habilitado");
        Concepto c2 = new Concepto(112, "presentismo", 500.00, 1, 0, "haber", "Habilitado");
        Concepto c3 = new Concepto(113, "obra social", 300.00, 0, 0.03,  "debe", "Habilitado");
        
        
        
        LineaLiquidacion ll1 = new LineaLiquidacion(1, 100.00, c1);
        LineaLiquidacion ll2 = new LineaLiquidacion(1, 100.00, c2);
        LineaLiquidacion ll3 = new LineaLiquidacion(1, 100.00, c3);
        
        Liquidacion l1 = new Liquidacion();
        l1.agregar(ll1);
        l1.agregar(ll2);
        l1.agregar(ll3);
        
        
        
        Turno t1 = new Turno();
        
        
        
        Empleado e = new Empleado(100, "juan", "messi", "juan@gmail.com", 35200000, null, null, d, u1, l1, t1);
        
        Cliente cl1 = new Cliente(1, "pablo", "diaz", "correo@correo", "mayorista");
        Cliente cl2 = new Cliente(2, "javier", "diaz", "correo@correo", "mayorista");
        Cliente cl3 = new Cliente(3, "federico", "diaz", "correo@correo", "mayorista");
        Cliente cl4 = new Cliente(4, "sergio", "diaz", "correo@correo", "mayorista");
        
        Controlador clogin = new Controlador();
        
        clogin.empresa.agregarCliente(cl4);
        
        
        clogin.empresa.agregarCliente(cl3);
        clogin.empresa.agregarCliente(cl2);
        clogin.empresa.agregarCliente(cl1);
        
        clogin.empresa.agregarEmpleado(e);
        clogin.empresa.agregarArticulo(a1);
        clogin.empresa.agregarArticulo(a2);
        clogin.empresa.agregarArticulo(a3);
        
        clogin.empresa.agregarConcepto(c1);
        clogin.empresa.agregarConcepto(c2);
        clogin.empresa.agregarConcepto(c3);
        
        clogin.Iniciar();
        
    }
    
}
