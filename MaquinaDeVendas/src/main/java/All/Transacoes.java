package All;

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;

public abstract class Transacoes {
    private String data;
    private String tipo_transacao;
    private String tipo_operacao;
    private int cdg_pdt;
    private float vlr_pdt;
    
    public Transacoes(){
        
    }
    public void set_time(){
        this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }
    public void set_cdg_pdt(int cdg){
        this.cdg_pdt = cdg;
    }
    public void set_vlr_pdt(float vlr){
        this.vlr_pdt = vlr;
    }
    public void set_tipo_operacao(String tipo){
        this.tipo_operacao = tipo;
    }
    public void set_tipo_transacao(String tipo){
        this.tipo_transacao = tipo;
    }
    public String get_data(){
        return this.data;
    }
    public String get_tipo(){
        return this.tipo_transacao;
    }
    public String get_tipo_operacao(){
        return this.tipo_operacao;
    }
    public String get_cdg_pdt(){
        return String.valueOf(this.cdg_pdt);
    }
    public String get_vlr_pdt(){
        return String.valueOf(this.vlr_pdt);
    }
}
