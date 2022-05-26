/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Cuenta implements Serializable {
    private Cliente elCliente;
    private String numCuenta;
    private double saldo;

    public Cuenta(Cliente elCliente, double saldo, String numCuenta) {
        this.elCliente=elCliente;
        this.saldo=saldo;
        this.numCuenta=numCuenta;
    }
    
    public double obtenerSaldo()
    {
        return this.saldo;
    }
    public Cliente obtenerCliente()
    {
        return this.elCliente;
    }

    public String obtenerNumCuenta() 
    {
        return numCuenta;
    }
    
    public void obtenerSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void modiCliente(Cliente elCliente)
    {
        this.elCliente = elCliente;
    }
     public void setNumCuenta(String genCuenta) 
    {
        this.numCuenta = numCuenta;
    }
 @Override
    public String toString()
    {
        return "Numero de cuenta: "+numCuenta+" del cliente: "+elCliente+" con saldo: "+saldo;
    }
       
}
    
    
    

