import javax.swing.JOptionPane;


public class Menu {
    
    
       int i=0;
       String mens="";
       int op=1;
       Produtos p = new Produtos();
       Conversor c = new Conversor();
       EntradaSaida io = new EntradaSaida();
       
       public void MenuInicial(){
           
    
       do{
           
           try{
               
               op = i;
               
    
           mens="Menu de Opções"
                   + "\n1-Cadastrar salário fixo"
                   + "\n2-Cadastrar total de vendas"
                   + "\n3-Calcular Comissão"
                   + "\n4-Calcular Salário Total"
                   + "\n0-Sair";
           
            op=Integer.parseInt(JOptionPane.
                   showInputDialog(mens));
           
             } catch (NumberFormatException e){
                 
       JOptionPane.showMessageDialog(null,"Digite apenas números\n\nErro: "+e);
       
      }
           
           
           
                              
           switch(op){
               
               case 1:
                  
                   p.EntradaSalFx();
                  
               break;
               
               case 2:
                   
                   p.EntradaTotVendas();
                  
               break;
               
               case 3:
                   
                   
                   p.CalcularComissao();
               break;
               
               case 4:
                   
                  p.CalcularSalario();

                   
               break;
               
               case 5:
                   
                   
                   
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