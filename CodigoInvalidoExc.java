/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class CodigoInvalidoExc extends Exception{
    
    private String msg;
    
    public CodigoInvalidoExc(int codigo)
    {
        msg = "Codigo Invalido! Codigo: " + codigo;
    }
    
    public String toString()
    {
        return msg;
    }
}
