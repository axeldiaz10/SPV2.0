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
public class Empresa {
    public ArrayList <Empleado> conjEmpleados = new ArrayList<>();
    public ArrayList <Articulo> conjArticulos = new ArrayList<>();
    public ArrayList <Cliente> conjClientes = new ArrayList<>();
    public Terminal terminal;
    public Persistencia persistencia;

    
    public Empresa() {
        terminal = new Terminal();
    }

    public ArrayList<Cliente> getConjClientes() {
        return conjClientes;
    }

    public void setConjClientes(ArrayList<Cliente> conjClientes) {
        this.conjClientes = conjClientes;
    }
      
    public ArrayList<Empleado> getConjEmpleados() {
        return conjEmpleados;
    }

    public void setConjEmpleados(ArrayList<Empleado> conjEmpleados) {
        this.conjEmpleados = conjEmpleados;
    }

    public ArrayList<Articulo> getConjArticulos() {
        return conjArticulos;
    }

    public void setConjArticulos(ArrayList<Articulo> conjArticulos) {
        this.conjArticulos = conjArticulos;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Empresa{" + "conjEmpleados=" + conjEmpleados + ", conjArticulos=" + conjArticulos + ", conjClientes=" + conjClientes + ", terminal=" + terminal + '}';
    }    

       
    public void agregarEmpleado (Empleado e){
        conjEmpleados.add(e);
    }
    
    public void agregarCliente (Cliente c){
        conjClientes.add(c);
    }
    
   public boolean validarUsuario (String u, String c){
       boolean b=false;
       for (Empleado e : conjEmpleados) {
           b = e.buscarUsuario(u, c);
       }
       if (b==false){
           System.out.println("Usuario y/o Contraseña incorrecta");
       }
       return b;
   }

    public void agregarArticulo(Articulo a) {
        conjArticulos.add(a);
    }
    
    public Articulo buscarArticulo (int codigo){
        
        Articulo a = new Articulo();
        for (Articulo b : conjArticulos) {
            if (codigo == b.getCodigo()) {
                a=b;
                System.out.println("Encontro un articulo");
            }
            
        }return a;
    }    
        public void agregarArticuloAVenta(Articulo a, int c) {
        terminal.agregarArticuloAVenta(a, c);
    }

    public double calcularTotal(Articulo a, int cant) {
        
        return terminal.calcularTotal(a,cant);
        
    }

    public double calcularVuelto(double dr) {
        return terminal.calcularVuelto(dr);
        
    }
    
    public Venta obtenerVentaActual(){
        return terminal.obtenerVentaActual();
    }
    
    
    
   
   
}
