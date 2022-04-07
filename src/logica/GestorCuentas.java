/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.Cliente;
import datos.Cuenta;
import datos.Opcionidentificacion;

/**
 *
 * @author Asus
 */
public class GestorCuentas {
    public Cuenta CrearCuenta(String nombre, String tidentificacion, String valorInicial, 
            Opcionidentificacion opcion){
          if (nombre == null || tidentificacion == null ||valorInicial == null 
            || opcion == null || nombre.isEmpty() || tidentificacion.isEmpty()){
            return null;
        }else{
            Cliente elcliente = this.crearCuenta(nombre, tidentificacion, valorInicial);
            Cuenta a = new Cuenta(elcliente, opcion);
            return a;
        }
    }
public Cuenta CrearCliente(String nombre, String tidentificacion ){
          if (nombre == null || tidentificacion == null || nombre.isEmpty() || tidentificacion.isEmpty()){
            return null;
        }else{
            Cliente elcliente = this.crearCliente(nombre, tidentificacion);
        Opcionidentificacion opcion = null;
            Cuenta a = new Cuenta(elcliente, opcion);
          }       
    


    private Cliente crearCliente(String nombre, String tidentificacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



