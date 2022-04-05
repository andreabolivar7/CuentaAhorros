/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Asus
 */
public class Cliente {
    private String nombre;
    private String tidentificacion;
    private int valorinicial;
    
    public Cliente(String nombre, String tidentificacion, int valorinicial){
        this.nombre = nombre;
        this.tidentificacion = tidentificacion;
        this.valorinicial= valorinicial;
    }
    public Cliente(String tidentificacion){
       
        this.tidentificacion = tidentificacion;
        
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerTidentificacion(){
        return this.tidentificacion;
    }
    public int obtenerValorinicial(){
        return this.valorinicial;
    }
}
