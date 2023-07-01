/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class Comerciais extends Imovel{
    
    private boolean escritorio, loja;
    
    public Comerciais(int codigo, int cep, String nome, String endereco, boolean escritorio, boolean loja)
    {
        super(codigo, cep, nome, endereco);
        this.escritorio = escritorio;
        this.loja = loja;
    }
    
    //Getter e setters

    public boolean isEscritorio() {
        return escritorio;
    }

    public void setEscritorio(boolean escritorio) {
        this.escritorio = escritorio;
    }

    public boolean isLoja() {
        return loja;
    }

    public void setLoja(boolean loja) {
        this.loja = loja;
    }
    
    
}

//São sempre para aluguel