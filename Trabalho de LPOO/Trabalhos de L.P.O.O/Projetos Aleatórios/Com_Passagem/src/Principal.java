
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
        int n1, n2, res;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° Número"));
    
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° Número"));

        Somar(n1,n2);
        Subtracao(n1, n2);
        Divisao(n1, n2);
        Multiplicaçao(n1,n2);
        
    }
    
    public static void Somar(int n1 , int n2){
        
        int res=n1+n2;
        
        JOptionPane.showMessageDialog(null, "A Soma dos valores é = "+res);
    }
    
    public static void Subtracao(int n1 , int n2){
        
        int res=n1-n2;
        
        JOptionPane.showMessageDialog(null, "A Subtração dos valores é = "+res);
    }

    public static void Divisao(int n1 , int n2){
        
        int res=n1/n2;
        
        JOptionPane.showMessageDialog(null, "A Divisão dos valores é = "+res);
    }

    public static void Multiplicaçao(int n1 , int n2){
        
        int res=n1*n2;
        
        JOptionPane.showMessageDialog(null, "A Multiplicação dos valores é = "+res);
    }    
}

