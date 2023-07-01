/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class CodigoRepetidoExc extends Exception{
    
    private String msg;
    
    public CodigoRepetidoExc(int cod)
    {
        msg = "Codigo ja incluido na Lista! Codigo: " + cod;
    }
    
    public String toString()
    {
        return msg;
    }
}
