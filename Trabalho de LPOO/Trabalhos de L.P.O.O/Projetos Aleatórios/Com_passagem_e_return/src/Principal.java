
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
        int i=0;
       String mens="";
       int op=1, n1=0, n2=0, valor=0;
       double resultado;
       do{
           mens="Menu de Opções"
                   + "\n1-Cadastrar números"
                   + "\n2-Soma"
                   + "\n3-Subtrair"
                   + "\n4-Dividir"
                   + "\n5-Multiplicar"
                   + "\n0-Sair";
                   
           op=Integer.parseInt(JOptionPane.
                   showInputDialog(mens));
           switch(op){
               
               case 1:
                   
                  n1=Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
                  
                  n2=Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
                   
               break;
               
               case 2:
                
                  valor=Somar(n1,n2);
                  
                  JOptionPane.showMessageDialog(null, "A Soma dos valores = "+valor);

               break;
               
               case 3:
                  
                  valor=Subtracao(n1,n2);
                  
                  JOptionPane.showMessageDialog(null,"A Subtração dos valores = "+valor);
                   
               break;
               
               case 4:
                  
                  valor=Divisao(n1,n2);
                  
                  JOptionPane.showMessageDialog(null,"A Divisão dos valores = "+valor);
                  
               break;
               
               case 5:
                   
                  valor=Multiplicacao(n1,n2);
                  
                  JOptionPane.showMessageDialog(null,"A Multiplicação dos valores = "+valor);
                  
               break;
               
               case 0:
                   JOptionPane.showMessageDialog(null,"Saindo....");
                   
               break;
               
               default:
                   
                   JOptionPane.showMessageDialog(null,"Opção Inválida");
                   
               break;
           }
           
       }while(op!=0);
       
    }
    
        public static int Somar(int n1 , int n2){
            
            int res=n1+n2;
        
            return res;
       
           }
        
                public static int Subtracao(int n1 , int n2){
            
            int res=n1-n2;
        
            return res;
       
           }
                
                        public static int Divisao(int n1 , int n2){
            
            int res=n1/n2;
        
            return res;
       
           }
                        
                                public static int Multiplicacao(int n1 , int n2){
            
            int res=n1*n2;
        
            return res;
       
           }
       
    
}
