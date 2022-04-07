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
    private String valorInicial;
    
   public String obtenerNombre(){
        return this.nombre;
    }
    
     public String obtenerTidenti(){
        return this.tidentificacion;
    }
    
    public String obtenerValori(){
        return this.valorInicial;
    }
    
    public void modificarNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void modificarTidenti(String identi){
        this.tidentificacion=tidentificacion;
    }
    
    public void modificarValori(String valorInicial){
        this.valorInicial=valorInicial;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" Tipo de identificacion: "+this.tidentificacion+" Valor inicial: "+this.valorInicial;
    }

    String obtenerCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
