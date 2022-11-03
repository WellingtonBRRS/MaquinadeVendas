package All;

public class Transacao_Cofre extends Transacoes {
    public Transacao_Cofre(String tipo,float vlr){
        this.set_time();
        this.set_tipo_operacao("COFRE");
        this.set_tipo_transacao(tipo);
        this.set_vlr_pdt(vlr);
        this.set_cdg_pdt(999);
        
    }
}
