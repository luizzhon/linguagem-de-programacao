
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo.ferreira
 */
public class EntradaSaida {
    
    public String EntradaDados(String msg){
        String info=JOptionPane.showInputDialog(msg);
        return info;
    }
    
    public void SaidaDados(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
