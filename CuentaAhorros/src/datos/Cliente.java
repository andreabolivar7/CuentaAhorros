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
public class Cliente implements Serializable {
    private String nombre;
    private String identificacion;
    private String tidentificacion;
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    public String obtenerIdentificacion()
    {
        return this.identificacion;
    }
    public String obtenertindetificacion()
    {
        return this.tidentificacion;
    }

    public void modiNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void modiIdentificacion(String identificacion)
    {
        this.identificacion = identificacion;
    }
     public void modiTidentificacion(String tidentificacion)
    {
        this.tidentificacion = tidentificacion;
    }

   @Override
    public String toString()
    {
        return "Cliente : "+this.nombre+" con identificación: "+this.identificacion +" tipo de identificacion: "+this.tidentificacion;
    }
}