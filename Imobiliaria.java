/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDeImoveis list = new ListaDeImoveis(3);
        
        Comerciais c = new Comerciais(1, 369, "Clovis", "Rua Maca",true,false);
        Residenciais r = new Residenciais(2,177, "Joao", "Rua Abacaxi", 2, 2);
        Residenciais r1 = new Residenciais(3,321,"Roberta","Rua Melao",2,1);
        try
        {
            list.cadastrarImovel(r);
            list.cadastrarImovel(c);
            list.cadastrarImovel(r1);
            list.alugarImovel(3, "Jorge");
            list.venderImovel(2, "Jonas");
            //list.venderImovel(2,"Klayton");
            //list.alugarImovel(2, "Roger");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
       list.listarImoveis("Teste", false, false);
    }
    
}
