/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Vítor
 */
public class ListaDeImoveis {
    
    private int count;
    private Imovel list[];
    
    public ListaDeImoveis(int capMax)
    {
        count = 0;
        list = new Imovel[capMax];
    }
    
    
    public void cadastrarImovel(Imovel imv) throws ListaLotadaExc, CodigoRepetidoExc
    {
        if(list.length <= count) throw new ListaLotadaExc(list.length);
        for(int i = 0; i < count; i++)
        {
            if(list[i].getCodigo() == imv.getCodigo()) throw new CodigoRepetidoExc(list[i].getCodigo());
        }
        list[count] = imv;
        list[count].setAlugado(false);
        count++;      
    }
    
    private boolean codigoExistente(int codigo)
    {
        for(int i =0;i<count;i++)
        {
            if(list[i].getCodigo() == codigo) return true;
        }
        return false;
    }
    
    public void alugarImovel(int codigo, String corretor) throws CodigoInvalidoExc, ImovelVendidoExc
    {
        if(!codigoExistente(codigo)) throw new CodigoInvalidoExc(codigo);
        
        for(int i = 0; i < count; i++)
        {
            if(list[i].getCodigo() == codigo)
            {
                if(list[i] instanceof Residenciais)
                {
                    Residenciais r = (Residenciais)list[i];
                    if(r.isVendido())throw new ImovelVendidoExc(codigo);
                }              
                list[i].setAlugado(true);
                list[i].setCorretor(corretor);
            }
           // if(count == i && list[i].getCodigo() != codigo)
           // {
                //throw new CodigoInvalidoExc(codigo);
            //}
        }
        
    }
    
    public void venderImovel(int codigo, String corretor) throws ImovelComercialExc, CodigoInvalidoExc, AlugarApenasExc, ImovelVendidoExc
    {
        if(!codigoExistente(codigo)) throw new CodigoInvalidoExc(codigo);
        for(int i = 0; i < count; i++)
        {
            if(list[i].getCodigo() == codigo)
            {
                if(list[i] instanceof Comerciais) throw new ImovelComercialExc(codigo);
                if(list[i] instanceof Residenciais)
                {
                    Residenciais r = (Residenciais)list[i];
                    if(r.isVendido())throw new ImovelVendidoExc(codigo);
                    r.setVendido(true);
                    r.setCorretor(corretor);
                }
            }
            //if(count == i && list[i].getCodigo() != codigo)
            //{
            //    throw new CodigoInvalidoExc(codigo);
            //}
        }
        
    }
    
    public void listarImoveis(String titulo, boolean apenasDisponiveis, boolean residenciais)
    {
        System.out.println("\n" + titulo + "\n");
        if(apenasDisponiveis && !residenciais)
        {
            System.out.println("Imoveis Disponiveis!\n");
            for(int i=0;i<count;i++)
            {
                if(!list[i].isAlugado())
                {
                    System.out.println("Codigo: " + list[i].getCodigo()
                    + "\nEndereco: " + list[i].getEndereco()
                    + "\nCep: " + list[i].getCep()
                    + "\nProprietario: " + list[i].getNome());
                    if(list[i] instanceof Residenciais)
                    {
                        Residenciais r = (Residenciais)list[i];
                        System.out.println("Quartos: " + r.getQuartos()
                        + "\nVagas: " + r.getVagas());
                    }
                    if(list[i] instanceof Comerciais)
                    {
                        Comerciais c = (Comerciais)list[i];
                        if(c.isEscritorio())System.out.println("Escritorio");
                        else System.out.println("Loja");
                    }
                }   
                System.out.println("");
            }
        }
        
        if(residenciais && !apenasDisponiveis)
        {
            System.out.println("Imoveis Residenciais\n");
            for(int i=0;i<count;i++)
            {
                if(list[i] instanceof Residenciais)
                {
                    Residenciais r = (Residenciais)list[i];
                    System.out.println("\nCodigo: " + list[i].getCodigo()
                    + "\nEndereco: " + list[i].getEndereco()
                    + "\nCep: " + list[i].getCep()
                    + "\nProprietario: " + list[i].getNome()
                    + "\nQuartos: " + r.getQuartos()
                    + "\nVagas: " + r.getVagas()
                    + "\nVendido: " + (r.isVendido()?"Sim" + " Corretor: " + r.getCorretor():"Nao")
                    + "\nAlugado: " + (r.isAlugado()?"Sim" + " Corretor: " + r.getCorretor():"Nao"));
                    
                }
            }
        }
        
        if(!apenasDisponiveis && !residenciais)
        {
            for(int i =0;i<count;i++)
            {
                if(list[i] instanceof Residenciais)
                {
                    System.out.println("\nImovel Residencial");
                    Residenciais r = (Residenciais)list[i];
                    System.out.println("Codigo: " + list[i].getCodigo()
                    + "\nEndereco: " + list[i].getEndereco()
                    + "\nCep: " + list[i].getCep()
                    + "\nProprietario: " + list[i].getNome()
                    + "\nQuartos: " + r.getQuartos()
                    + "\nVagas: " + r.getVagas()
                    + "\nVendido: " + (r.isVendido()?"Sim" + " Corretor: " + r.getCorretor():"Nao")
                    + "\nAlugado: " + (r.isAlugado()?"Sim" + " Corretor: " + r.getCorretor():"Nao"));
                }
                if(list[i] instanceof Comerciais)
                {
                    System.out.println("\nImovel Comercial");
                    Comerciais c = (Comerciais)list[i];
                    System.out.println("Codigo: " + list[i].getCodigo()
                    + "\nEndereco: " + list[i].getEndereco()
                    + "\nCep: " + list[i].getCep()
                    + "\nProprietario: " + list[i].getNome());
                    if(c.isEscritorio())System.out.println("Escritorio");
                    if(c.isLoja())System.out.println("Loja");
                    System.out.println("Alugado: " + (c.isAlugado()?"Sim" + " Corretor: " + c.getCorretor():"Nao"));
                }
                
            }
        }
        
        if(apenasDisponiveis && residenciais)
        {
            for(int i = 0;i<count;i++)
            {
                if(list[i] instanceof Residenciais)
                {
                    Residenciais r = (Residenciais)list[i];
                    if(!r.isAlugado())
                    {
                         System.out.println("Imovel Residencial");
                        System.out.println("\nCodigo: " + list[i].getCodigo()
                        + "\nEndereco: " + list[i].getEndereco()
                        + "\nCep: " + list[i].getCep()
                        + "\nProprietario: " + list[i].getNome()
                        + "\nQuartos: " + r.getQuartos()
                        + "\nVagas: " + r.getVagas()
                        + "\nVendido: " + (r.isVendido()?"Sim" + " Corretor: " + r.getCorretor():"Nao")
                        + "\nAlugado: " + (r.isAlugado()?"Sim" + " Corretor: " + r.getCorretor():"Nao"));
                    }
                }
            }
        }
    }
}
