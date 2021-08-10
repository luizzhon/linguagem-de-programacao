
import javax.swing.JOptionPane;


public class EntradaSaida {
    
    public String EntradaDados(String msg){
    
    String dado=JOptionPane.showInputDialog(msg);
    return dado;
    
    }
    
    public void SaidaDados(String msg){
    
    JOptionPane.showMessageDialog(null , msg);
    
    }
    
}
