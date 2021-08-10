
public class Usuario {
    
    
    private String Login;
    private String Senha;

 
    public String GetLogin() {
        return Login;
    }

  
    public void SetLogin(String Login) {
        this.Login = Login;
    }

    public String GetSenha() {
        return Senha;
    }

    public void SetSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public boolean Validar(){
    
        
        if(this.GetLogin().equals("DanDan")&& this.GetSenha().equals("1234")){
        
        return true;
        
        }
        else{
        
        return false;
            
        }
        
    }
}
