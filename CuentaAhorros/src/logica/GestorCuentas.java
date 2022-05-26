/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Utilidades.GestorPersistencia;
import datos.Cliente;
import datos.Cuenta;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class GestorCuentas extends GestorCuentasM implements Serializable {
    
public Map<String, Cuenta> ListaCuentas;
    public GestorCuentas()
    {
        if(ListaCuentas == null)
        {
            ListaCuentas = (Map<String, Cuenta>) GestorPersistencia.recuperar();
            if(ListaCuentas == null)
            {
                ListaCuentas = new HashMap<>();
            }
        }
        
    }
    
     
 
 private Cliente crearCliente(String nombre, String identificacion, String tidentificacion){
   Cliente m = new Cliente();
        m.modiNombre(nombre);
        m.modiIdentificacion(identificacion);
        m.modiTidentificacion(tidentificacion);
        return m;   
  }
 public Cuenta crearCuenta(String nombre, String identificacion, String tipoId, double valor)
    {
        if(nombre == null || identificacion == null || nombre.isEmpty() || identificacion.isEmpty())
        {
            return null;
        }
        else
        {
            Cliente elCliente = this.crearCliente(nombre, identificacion, tipoId);
            Cuenta p = new Cuenta(elCliente, valor, obtenerdigitos(identificacion));
            ListaCuentas.put(p.obtenerNumCuenta(),p);
            GestorPersistencia.guardar(ListaCuentas);
            return p;
        }
    }
  public String obtenerdigitos(String tidentificacion){
      if(tidentificacion.length()>4)
        {
            char num1 = tidentificacion.charAt(tidentificacion.length()-1);
            char num2 = tidentificacion.charAt(tidentificacion.length()-2);
            char num3 = tidentificacion.charAt(tidentificacion.length()-3);
            char num4 = tidentificacion.charAt(tidentificacion.length()-4); 
            
            String Digitos = (Character.toString(num1)+Character.toString(num2)+Character.toString(num3)+Character.toString(num4));
            
            
            int [] n = construirAleatoreo();
            String numerocuenta = "57"+"22"+Digitos+Arrays.toString(n).format(",");
            toString();
            return numerocuenta;
        }
      else {
          return null;
      }
  }

    @Override
    public int[] construirAleatoreo() {
       int numero[] = new int [4];
        
        int num1 = generarAleatoreo();
        numero [0]=num1;
        int posicion=1;
        while(posicion<4)
        {
           int num2 = generarAleatoreo();
           boolean existe=false;
           for(int i=0; i<posicion; i++){
               if (numero[i]==num2)
               {
                   existe=true;
               }
           }
           if(!existe )
           {
               numero [posicion++]=num2;
           }
 
        }
        return numero;
    }
    @Override
    public String toString()
    {
        return "El numero es: "+this.construirAleatoreo();
    }
      public Map<String, Cuenta> obtenerLista(){
        return (Map<String, Cuenta>) this.ListaCuentas;
    }        
}
