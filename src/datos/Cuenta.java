/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class Cuenta {
    private Cliente elcliente;
    private Opcionidentificacion opcion;
    private String numerocuenta;
    private Date fechaCrea;

    public Cuenta(Cliente elcliente, Opcionidentificacion opcion, Date fechacrea, String numerocuenta){
        this.numerocuenta = numerocuenta;
        this.elcliente = elcliente;
        this.opcion = opcion;
        this.fechaCrea= fechaCrea;
    }
    public Cliente obtenerCliente(){
        return this.elcliente;
    }

    public Date obtenerFechaCrea(){
        return this.fechaCrea;
    }
    public String numerocuenta(){
        return this.numerocuenta;
    }
    public Cuenta(Cliente elcliente, Opcionidentificacion opcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String toString() {
        return "Nombre: "+elcliente.obtenerCliente()+"Fecha de asignacion: "+this.fechaCrea;
    }
    }
    
    
    

