/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empresa;
import Modelo.Persistencia;
import Vista.ABMCliente;
import Vista.ABMConcepto;
import Vista.HistorialVenta;
import Vista.Login;
import Vista.MenuPrincipal;
import Vista.NuevaVenta;
import Vista.NuevoCliente;
import Vista.NuevoConcepto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.RowFilter;


/**
 *
 * @author Axel
 */
public class Controlador implements ActionListener, KeyListener{
    private Login login;
    private MenuPrincipal menu;
    private NuevaVenta nuevaVenta;
    private HistorialVenta historialVenta;
    private ABMCliente abmCliente;
    private NuevoCliente nuevoCliente;
    private ABMConcepto abmConcepto;
    private NuevoConcepto nuevoConcepto;
    public Empresa empresa;
    public Persistencia persistencia;
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(Login.INICIARSESION)) {
           IniciarMenu(empresa.validarUsuario(login.getUsuario(),login.getContraseña()),login.getUsuario()); 
        }
        //NUEVA VENTA
        if (e.getActionCommand().equals(MenuPrincipal.NUEVAVENTA)) {
            IniciarNuevaVenta(login.getUsuario());
            
        }
        
        if (e.getActionCommand().equals(NuevaVenta.BUSCAR)) {
            nuevaVenta.setDescripcion(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())).getDescripcion());
            nuevaVenta.setPrecioUnitario(String.valueOf(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())).getPrecioUnitario()));
            nuevaVenta.setCantidad(0);
        }
        
        if (e.getActionCommand().equals(nuevaVenta.AGREGAR)) {
            //empresa.agregarArticulo(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo(),Integer.parseInt(nuevaVenta.getCantidad()))));
            empresa.agregarArticuloAVenta(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())), Integer.parseInt(nuevaVenta.getCantidad()));
            nuevaVenta.setTablaArticulos(String.valueOf(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())).getCodigo()),
                                         String.valueOf(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())).getDescripcion()), 
                                         String.valueOf(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())).getPrecioUnitario()), 
                                         String.valueOf(nuevaVenta.getCantidad()));
            nuevaVenta.setTotal(String.valueOf(empresa.calcularTotal(empresa.buscarArticulo(Integer.parseInt(nuevaVenta.getCodigo())), Integer.parseInt(nuevaVenta.getCantidad()))));
            
            
        }
        
        if (e.getActionCommand().equals(nuevaVenta.REGISTRARPAGO)) {
        //CalcularVuelto
        nuevaVenta.setVuelto(String.valueOf(empresa.calcularVuelto(Double.parseDouble(nuevaVenta.getDineroRecibido()))));
        persistencia.crearVenta(empresa.obtenerVentaActual());  //Persistir Venta
        persistencia.actualizarStock(empresa.obtenerVentaActual()); //Actulizar Stock
        // vaciar Venta
        }
        //HISTORIAL VENTA
        if (e.getActionCommand().equals(MenuPrincipal.HISTORIALVENTA)) {
            IniciarHistorialVenta(login.getUsuario());
        }
        
        
        //ABM CLIENTE
        if (e.getActionCommand().equals(MenuPrincipal.ABMCLIENTE)) {
            IniciarABMCliente(login.getUsuario());
            abmCliente.cargarTabla(empresa.conjClientes);
        }
        
        if (e.getActionCommand().equals(ABMCliente.NUEVO)){
            IniciarNuevoCliente(login.getUsuario());
        }
        
        if (e.getActionCommand().equals(NuevoCliente.CREAR)){
            persistencia.crearCliente(nuevoCliente.getNombre(),nuevoCliente.getApellido(),nuevoCliente.getCorreo(),nuevoCliente.getTipo()); //Persistir Cliente
        }
        
        //ABM CONCEPTO
        if (e.getActionCommand().equals(MenuPrincipal.ABMCONCEPTO)) {
            IniciarABMConcepto(login.getUsuario());
            abmConcepto.cargarTabla(empresa.conjConceptos);
        }
        
        if (e.getActionCommand().equals(ABMConcepto.NUEVO)) {
            IniciarNuevoConcepto(login.getUsuario());
            
        }
        
        
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
        if (abmCliente.getChkPorApellido().isSelected()) {
            abmCliente.trs.setRowFilter(RowFilter.regexFilter("(?i)"+abmCliente.getBuscar(), 1));
            abmCliente.filtrarTabla();
        }
        if (abmCliente.getChkPorNombre().isSelected()) {
            abmCliente.trs.setRowFilter(RowFilter.regexFilter("(?i)"+abmCliente.getBuscar(), 2));
            abmCliente.filtrarTabla();
            System.out.println("Entra por aqui");
        }
        
        if (abmConcepto.getChkPorTipo().isSelected()) {
            abmConcepto.trs.setRowFilter(RowFilter.regexFilter("(?i)"+abmConcepto.getBuscar(), 5));
            abmConcepto.filtrarTabla();
        }
        if (abmConcepto.getChkPorDescripcion().isSelected()) {
            abmConcepto.trs.setRowFilter(RowFilter.regexFilter("(?i)"+abmConcepto.getBuscar(), 1));
            abmConcepto.filtrarTabla();
            System.out.println("Entra por aqui");
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    
    
    public Controlador() {
        empresa = new Empresa();
        login = new Login(this);
        menu = new MenuPrincipal(this);
        nuevaVenta = new NuevaVenta(this);
        historialVenta = new HistorialVenta(this);
        abmCliente = new ABMCliente(this);
        nuevoCliente = new NuevoCliente(this);
        abmConcepto = new ABMConcepto(this);
        nuevoConcepto = new NuevoConcepto(this);
        
    }
    
    public void Iniciar (){
        login.setVisible(true);
        
    }
    
    public void IniciarMenu (boolean b, String u){
        
        if(b==true){
            menu.setVisible(b);
            menu.setUsuario(u);
            login.setVisible(false);
        }
        else System.out.println("Ocurrio algun problema por el que no se abrio el menu");
    }
    
    public void IniciarNuevaVenta (String u){
        nuevaVenta.setVisible(true);
        nuevaVenta.setUsuario(u);
             
    }

    private void IniciarHistorialVenta(String u) {
        historialVenta.setVisible(true);
        historialVenta.setUsuario(u);
        
        
    }

    private void IniciarABMCliente(String u) {
        abmCliente.setVisible(true);
        abmCliente.setUsuario(u);
    }
    
    private void IniciarNuevoCliente(String u){
        nuevoCliente.setVisible(true);
        nuevoCliente.setUsuario(u);
        System.out.println("ENTRANDO X ACA");
    }

    private void IniciarABMConcepto(String u) {
        abmConcepto.setVisible(true);
        abmConcepto.setUsuario(u);
    }

    private void IniciarNuevoConcepto(String u) {
        nuevoConcepto.setVisible(true);
        
    }

 
    
    
}
