/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class ImovelComercialExc extends Exception{
    
    private String msg;
    
    public ImovelComercialExc(int codigo)
    {
        msg = "Imovel Comercial! Codigo: " + codigo;
    }
    
    public String toString()
    {
        return msg;
    }
}
