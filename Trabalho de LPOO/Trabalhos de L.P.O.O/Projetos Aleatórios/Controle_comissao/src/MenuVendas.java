
import javax.swing.JOptionPane;


public class MenuVendas {
    
    
        int i=0;
       String mens="";
       int op=1;
       Vendedor a = new Vendedor();
       Comissoes n = new Comissoes();
       
       public void op(){
    
       do{
           mens="Menu de Opções"
                   + "\n1-Cadastrar Dados do Vendedor"
                   + "\n2-Exibir Dados do Vendedor"
                   + "\n3-Cadastrar Vendas"
                   + "\n4-Calcular Comissão"
                   + "\n5-Calcular Salário Total"
                   + "\n0-Sair";
           
           op=Integer.parseInt(JOptionPane.
                   showInputDialog(mens));
           
           switch(op){
               
               case 1:
                  
                   a.CadastrarDados();
                  
               break;
               
               case 2:
                   
                   a.ExibirDados();
                  
               break;
               
               case 3:
                   
                   n.CadastrarVendas();
                   
               break;
               
               case 4:
                   
                  n.CalcularComissao();

                   
               break;
               
               case 5:
                   
                   n.CalcularTotal();
                   
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
}