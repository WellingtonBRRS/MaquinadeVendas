package All;

public class MaquinaDeVendas{    
    private Cofre cofre;
    private Usuario user1;
    private Estoque estoque;
    private Pagamento pagamento;
    private Tela_Login tela_login;
    private Tela_Escolha tela_escolha;
    private Tela_Adm_Cofre tela_cofre;
    private Tela_Produtos tela_produtos;
    private Tela_Relatorio tela_relatorio;
    private Relatorio_Transacoes relatorio;
    private Tela_Gerenciamento tela_gerenciamento;
    
    public MaquinaDeVendas(){
        Cofre cofre = new Cofre();
        Estoque estoque = new Estoque();
        Usuario user1 = new Usuario("user","123");
        Relatorio_Transacoes relatorio = new Relatorio_Transacoes();
        Pagamento pagamento = new Pagamento(cofre,relatorio,estoque);
        
        Tela_Adm_Cofre tela_cofre = new Tela_Adm_Cofre(cofre,relatorio);
        Tela_Relatorio tela_relatorio = new Tela_Relatorio(relatorio);
        Tela_Escolha tela_escolha = new Tela_Escolha(estoque,pagamento);
        Tela_Gerenciamento tela_gerenciamento = new Tela_Gerenciamento(estoque,cofre,relatorio,tela_relatorio,tela_cofre);
        Tela_Login tela_login = new Tela_Login(user1,tela_gerenciamento);
        Tela_Produtos tela_produtos = new Tela_Produtos(estoque,user1,tela_login,tela_gerenciamento,tela_escolha);
    }
    
    public static void main(String[] args) {
        MaquinaDeVendas sistema = new MaquinaDeVendas();
    }
}