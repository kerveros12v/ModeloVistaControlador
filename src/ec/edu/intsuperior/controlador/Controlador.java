/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Operaciones;
import ec.edu.intsuperior.vista.Aplicacion;

/**
 *
 * @author dellubuntu
 */
public class Controlador {
    Aplicacion aplicacion=new Aplicacion(this);
    Operaciones operaciones=new Operaciones();
    public void suma(){
        aplicacion.jLabel4.setText(""+operaciones.suma(Integer.parseInt(aplicacion.jTextField1.getText()), Integer.parseInt(aplicacion.jTextField2.getText())));
    }
    public void resta(){
          aplicacion.jLabel4.setText(""+operaciones.resta(Integer.parseInt(aplicacion.jTextField1.getText()), Integer.parseInt(aplicacion.jTextField2.getText())));
    }
    public void multiplicacion(){
          aplicacion.jLabel4.setText(""+operaciones.multiplicacion(Integer.parseInt(aplicacion.jTextField1.getText()), Integer.parseInt(aplicacion.jTextField2.getText())));
    }
    public void division(){
          aplicacion.jLabel4.setText(""+operaciones.division(Integer.parseInt(aplicacion.jTextField1.getText()), Integer.parseInt(aplicacion.jTextField2.getText())));
    }
    public void visibleaplicacion(){
        aplicacion.setVisible(true);
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
        c.visibleaplicacion();
    }
}
