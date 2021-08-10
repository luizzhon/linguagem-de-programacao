
import javax.swing.JOptionPane;


public class Menu {
    
    public int op=1;
    public String msg;
    public int n1,n2,n3,n4;
    Calcule c = new Calcule();
    
    public void MenuInicial(){
    
        do{
    msg="Menu de Opções\n"
    +"\n1-O maior de dois números"
    +"\n2-O maior de três números"
    +"\n3-O maior de quatro números"
    +"\n0-Sair";
    
    op=Integer.parseInt(JOptionPane.showInputDialog( msg));
    
        switch(op){
        
            case 1:
                
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1°Número: "));
                
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2°Número: "));
                
                c.Maior(n1,n2);
            break;    
                
            case 2:
                
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1°Número: "));
                
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2°Número: "));
                
                n3=Integer.parseInt(JOptionPane.showInputDialog("Digite o 3°Número: "));
                
                c.Maior(n1, n2, n3);
            break;
            
            case 3:
                n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1°Número: "));
                
                n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o 2°Número: "));
                
                n3=Integer.parseInt(JOptionPane.showInputDialog("Digite o 3°Número: "));
                
                n4=Integer.parseInt(JOptionPane.showInputDialog("Digite o 4°Número: "));
                
                c.Maior(n1, n2, n3, n4);      
            break;
            
            case 0:
                
                JOptionPane.showMessageDialog(null, "Saindo...");
                
            break;
            
            default:
                   
                   JOptionPane.showMessageDialog(null,"Opção Inválida");
                   
            break;
        
        }
            }while(op!=0);
    }
    
}
