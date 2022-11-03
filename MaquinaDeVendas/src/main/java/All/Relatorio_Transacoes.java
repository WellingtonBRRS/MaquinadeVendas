package All;

import java.util.ArrayList;

public class Relatorio_Transacoes {
    private ArrayList<Transacoes> relatorio;
    private int pos;
    private int qtd_pos;
    
    public Relatorio_Transacoes(){
        this.relatorio = new ArrayList<Transacoes>();
        relatorio.add(new Transacao_Cofre("SISTEMA INICIADO",0f));
        this.pos = 0;
        this.qtd_pos = 0;
    }
    public void add_relatorio_cofre(String tipo,float vlr){
        this.relatorio.add(new Transacao_Cofre(tipo,vlr));
        this.qtd_pos = this.qtd_pos + 1;
    }
    public void add_relatorio_venda(String tipo,int cdg_pdt,float vlr){
        this.relatorio.add(new Transacao_Venda(tipo,cdg_pdt,vlr));
        this.qtd_pos = this.qtd_pos + 1;
    }
    
    public String get_tipo_operacao(){
        return relatorio.get(this.pos).get_tipo_operacao();
    }
    public String get_tipo(){
        return relatorio.get(this.pos).get_tipo();
    }
    public String get_data(){
        return relatorio.get(this.pos).get_data();
    }
    public String get_cdg_pdt(){
        return relatorio.get(this.pos).get_cdg_pdt();
    }
    public String get_vlr_pdt(){
        return relatorio.get(this.pos).get_vlr_pdt();
    }
    public void proximo_relatorio(){
        if(this.qtd_pos>pos){
            this.pos = this.pos + 1;
        }
    }
    public void anterior_relatorio(){
        if(this.pos>0){
            this.pos = this.pos - 1;
        }
    }
}
