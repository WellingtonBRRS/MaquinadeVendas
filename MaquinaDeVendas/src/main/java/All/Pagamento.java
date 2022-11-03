package All;

public class Pagamento {
    private Cofre cofre;
    private Relatorio_Transacoes relatorio;
    private Estoque estoque;
    private Tela_Erro tela_erro;
    
    public Pagamento(Cofre cofre, Relatorio_Transacoes relatorio, Estoque estoque){
        this.cofre = cofre;
        this.relatorio = relatorio;
        this.estoque = estoque;
        this.tela_erro = tela_erro;
    }
    
    public boolean pagar(float preco,float vlr_pago,int cdg){
        float troco = vlr_pago - preco;
        if(vlr_pago>=preco && this.estoque.get_qtd_estoque(cdg)>0){
            if(this.cofre.testar_troco(preco,vlr_pago)){
                this.cofre.descontar(troco);
                this.cofre.add_valor_entrada();
                this.cofre.limpa_valor_entrada();
                this.relatorio.add_relatorio_venda("Venda",cdg,preco);
                this.estoque.retirar_produto(cdg);
                this.estoque.mais_vendido();
            }
        }else if(vlr_pago<preco){
            try{
                Tela_Erro tela_erro = new Tela_Erro("Valor insuficiente!");
            }catch(Exception e){
                System.out.println("Erro ao instanciar tela_erro");
            }
            this.cofre.limpa_valor_entrada();
            return false;
        }else{
            try{
                Tela_Erro tela_erro = new Tela_Erro("Estoque insuficiente!");
            }catch(Exception e){
                System.out.println("Erro ao instanciar tela_erro");
            }
            this.cofre.limpa_valor_entrada();
            return false;
        }
        return true;
    }
    public void valor_entrada(int cod){
        this.cofre.valor_entrada(cod);
    }
    
    public void limpa_valor_entrada(){
        this.cofre.limpa_valor_entrada();
    }
}
