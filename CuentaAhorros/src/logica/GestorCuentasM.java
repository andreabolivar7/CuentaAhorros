/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Asus
 */
public abstract class GestorCuentasM {
    private String digitosGen;
    
    public abstract int[] construirAleatoreo();
    
    public int generarAleatoreo()
    {
        int b = (int) (Math.random()*(9-0+1)+0);
        return b;
    }
    
}
