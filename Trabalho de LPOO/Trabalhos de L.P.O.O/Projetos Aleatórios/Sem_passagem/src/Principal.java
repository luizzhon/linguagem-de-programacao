
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 525457252
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Somar();
        Subtraçao();
        Divisao();
        Multiplicaçao();
        
    }
    
    public static void Somar() {
    
    int n1, n2, res=0;
    
        n1=Integer.parseInt(JOptionPane.showInputDialog("Soma\n\nDigite o 1° Número"));
    
        n2=Integer.parseInt(JOptionPane.showInputDialog("Soma\n\nDigite o 2° Número"));
    
            res=n1+n2;
    
    JOptionPane.showMessageDialog(null, "A soma deles é = "+res);
    
    }
    
    public static void Subtraçao(){
        
    int n1, n2, res=0;
    
        n1=Integer.parseInt(JOptionPane.showInputDialog("Subtração\n\nDigite o 1° Número"));
    
        n2=Integer.parseInt(JOptionPane.showInputDialog("Subtração\n\nDigite o 2° Número"));
    
            res=n1-n2;
    
    JOptionPane.showMessageDialog(null, "A Subtração deles é = "+res);
    
    }
    
    public static void Divisao(){
        
    int n1, n2, res=0;
    
        n1=Integer.parseInt(JOptionPane.showInputDialog("Divisão\n\nDigite o 1° Número "));
    
        n2=Integer.parseInt(JOptionPane.showInputDialog("Divisão\n\nDigite o 2° Número "));
    
            res=n1/n2;
    
    JOptionPane.showMessageDialog(null, "A Divisão deles é = "+res);
    }
    
    public static void Multiplicaçao(){
        
    int n1, n2, res=0;
    
        n1=Integer.parseInt(JOptionPane.showInputDialog("Multiplicação\n\nDigite o 1° Número "));
    
        n2=Integer.parseInt(JOptionPane.showInputDialog("Multiplicação\n\nDigite o 2° Número "));
    
            res=n1*n2;
    
    JOptionPane.showMessageDialog(null, "A Multiplicação deles é = "+res);
    
    }
}
