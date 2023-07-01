/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class ImovelVendidoExc extends Exception{
    
    private String msg;
    
    public ImovelVendidoExc(int codigo)
    {
        msg = "Imovel vendido!";
    }
    
    public String toString()
    {
        return msg;
    }
}
