/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class ListaLotadaExc extends Exception{
    
    private String msg;
    
    public ListaLotadaExc(int capMax)
    {
        msg = "Lista Lotada! Maximo de: " + capMax;
    }
    
    @Override
    public String toString()
    {
        return msg;
    }
}
