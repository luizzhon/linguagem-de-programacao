
public class Usuario {

    
    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String login;
    private String senha;

    boolean validar() {
        
        if(this.getSenha().equals("Pinto")&&this.getLogin().equals("Pinto")){
            return true;
        }
        else{
            return false;
            
        }
    }    
    
}
