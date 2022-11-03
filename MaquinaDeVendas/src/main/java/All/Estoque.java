package All;

import java.util.ArrayList;
import java.util.Iterator;

public class Estoque {
    private ArrayList<Produto> produtos;
    private Produto p1,p2,p3,p4,p5,p6;
    private int pdt_mais_vendido;
    
    public Estoque(){
        
        produtos = new ArrayList<Produto>();
        
        Produto p1 = new Produto(101,5f,"Coca",10);
        produtos.add(p1);
        Produto p2 = new Produto(102,5.20f,"Pepsi",10);
        produtos.add(p2);
        Produto p3 = new Produto(103,4.8f,"Fanta",10);
        produtos.add(p3);
        Produto p4 = new Produto(201,8f,"Doritos",10);
        produtos.add(p4);
        Produto p5 = new Produto(202,9f,"Ruffles",10);
        produtos.add(p5);
        Produto p6 = new Produto(203,10f,"Fandangos",10);
        produtos.add(p6);
        
        
    }
    
    public float get_preco(int cod){
        float prc = 0f;
        
        Iterator it = produtos.iterator();
        while(it.hasNext()){
            Produto p = (Produto) it.next();
            if(p.get_cod()==cod){
                prc = p.get_preco();
                break;
            }
        }
        
        return prc;
    }
    
    public String get_nome(int cod){
        String nome = "n enc.";
        
        Iterator it = produtos.iterator();
        while(it.hasNext()){
            Produto p = (Produto) it.next();
            if(p.get_cod()==cod){
                nome = p.get_nome();
                break;
            }
        }
        
        return nome;
    }
    
    public int get_qtd_estoque(int cod){
        int qtd = 0;
        
        Iterator it = produtos.iterator();
        while(it.hasNext()){
            Produto p = (Produto) it.next();
            if(p.get_cod()==cod){
                qtd = p.get_qtd_estoque();
                break;
            }
        }
        
        return qtd;
    }
    
    public void set_qtd_estoque(int cod,int vlr){
        Iterator it = produtos.iterator();
        while(it.hasNext()){
            Produto p = (Produto) it.next();
            if(p.get_cod()==cod){
                p.set_qtd_estoque(vlr);
                break;
            }
        }
    }
    
    public void retirar_produto(int cod){
        Iterator it = produtos.iterator();
        while(it.hasNext()){
            Produto p = (Produto) it.next();
            if(p.get_cod()==cod){
                p.retirar_produto();
                p.set_qtd_vendidos();
                break;
            }
        }
    }
    
    public void mais_vendido(){
        int aux_qtd=0, aux_cdg=0, loop=0;
        Iterator it = produtos.iterator();
        try{
            while(it.hasNext()){
                Produto p = (Produto) it.next();
                if(p.get_qtd_vendidos()>aux_qtd){
                    this.pdt_mais_vendido = p.get_cod();
                    aux_qtd = p.get_qtd_vendidos();
                }
            }
        }catch(Exception e){
            System.out.println("Erro encontrado");
        }
    }
    
    public int get_mais_vendido(){
        return this.pdt_mais_vendido;
    }
}
