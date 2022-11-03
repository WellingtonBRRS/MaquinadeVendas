package All;
import java.time.*;

public class Produto {
    private float preco;
    private int codigo;
    private String nome;
    private int qtd_estoque;
    private int qtd_vendidos;
    private String data_vencimento;
    
    public Produto(int cod,float prc, String nm, int qtd_est){
        this.codigo = cod;
        this.preco = prc;
        this.nome = nm;
        this.qtd_estoque = qtd_est;
        this.qtd_vendidos = 0;
        //this.data_vencimento = dt_v;
    }

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public float get_preco(){
        return preco;
    }
    
    public int get_cod(){
        return codigo;
    }
    
    public String get_nome(){
        return nome;
    }
    
    public int get_qtd_estoque(){
        return qtd_estoque;
    }
    
    public int get_qtd_vendidos(){
        return qtd_vendidos;
    }
    
    public void set_qtd_vendidos(){
        this.qtd_vendidos = this.qtd_vendidos + 1;
    }
    
    public void set_qtd_estoque(int vlr){
        this.qtd_estoque = this.qtd_estoque + vlr;
    }
    
    public void retirar_produto(){
        this.qtd_estoque = this.qtd_estoque - 1;
    }
}
