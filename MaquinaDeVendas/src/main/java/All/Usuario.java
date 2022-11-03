package All;

public class Usuario {
    private String usuario;
    private String senha;
    
    
    public Usuario(String user,String pass){
        this.usuario = user;
        this.senha = pass;
    }
    
    public boolean confirma_Login(String user, String pass){
        if(this.usuario.equals(user) && this.senha.equals(pass)){
            return true;
        }else{
            return false;
        }
    }
}
