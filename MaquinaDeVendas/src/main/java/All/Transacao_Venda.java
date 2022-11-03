package All;

public class Transacao_Venda extends Transacoes {
    public Transacao_Venda(String tipo,int cdg_pdt,float vlr){
        this.set_time();
        this.set_tipo_transacao(tipo);
        this.set_tipo_operacao("Venda de Produto");
        this.set_cdg_pdt(cdg_pdt);
        this.set_tipo_transacao("Venda de Produto");
        this.set_vlr_pdt(vlr);
    }
    
}