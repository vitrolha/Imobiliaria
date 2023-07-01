/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class Residenciais extends Imovel{
    
    private int quartos, vagas;
    private boolean vendido;
    
    public Residenciais(int codigo, int cep, String nome, String endereco, int quartos, int vagas)
    {
        super(codigo, cep, nome, endereco);
        this.quartos = quartos;
        this.vagas = vagas;
    }
    
    //Getters e setters

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
}

//Podem ser apenas para aluguel ou para aluguel e venda
