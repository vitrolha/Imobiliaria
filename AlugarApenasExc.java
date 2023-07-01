/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class AlugarApenasExc extends Exception{
    
    private String msg;
    
    public AlugarApenasExc()
    {
        msg = "Imovel pode apenas ser Alugado!";
    }
    
    public String toString()
    {
        return msg;
    }
}
