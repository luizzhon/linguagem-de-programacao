
import javax.swing.JOptionPane;


public class EntradaSaida {
    
    public String Entrada(String msg){

       String Dado=JOptionPane.showInputDialog(msg);
       
       return Dado;

    }
    
public void Saida(String msg){

    JOptionPane.showMessageDialog(null, msg);

    } 
    
}
