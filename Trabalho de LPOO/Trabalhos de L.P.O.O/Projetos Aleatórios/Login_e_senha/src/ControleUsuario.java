
import javax.swing.JOptionPane;


public class ControleUsuario {
    Usuario u = new Usuario();
    MenuSistema ms = new MenuSistema();
    
    
    public void Logar(String log, String sen){
    
        u.SetLogin(log);
        u.SetSenha(sen);
    
        boolean Verifica = u.Validar(); 
        
        if(Verifica==true){
        
            JOptionPane.showMessageDialog(null, "Login e Senha cadastrados");
            ms.setVisible(true);
        
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Login e Senha Inválidos");
            ms.setVisible(false);
        
        }
     
        
    
    }
    
}
