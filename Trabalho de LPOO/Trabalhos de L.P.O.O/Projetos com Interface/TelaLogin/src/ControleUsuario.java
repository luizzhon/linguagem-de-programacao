
import javax.swing.JOptionPane;


public class ControleUsuario {
    Usuario u = new Usuario();
    TelaLogin ts = new TelaLogin();
    boolean Logar(String log, String sen){
        u.setLogin(log);
        u.setSenha(sen);
    
        boolean verifica = u.validar();
        if(verifica==true){
            JOptionPane.showMessageDialog(null, "SUCESSO");
            ts.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "login ou senha invalidos");
            new TelaLogin().setVisible(false);
        }
        return false;
        
    }
}
