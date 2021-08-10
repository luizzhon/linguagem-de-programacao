
import javax.swing.JOptionPane;


public class Menu {
    
    public int op=0;
    public String msg;
    
    EntradaSaida io = new EntradaSaida();
    Conversor conv = new Conversor();
    Professor p = new Professor();
    Aluno a = new Aluno();
    
    public void op(){
    
       do{
           try{

      
           msg="Menu de opções\n"
            +"\n1-Cadastrar Professor"
            +"\n2-Cadastrar Aluno"
            +"\n3-Exibir professor"
            +"\n4-Exibir Aluno"
            +"\n0-Sair";
           
           op=conv.StringToInt(io.EntradaDados(msg));
           
           } catch (NumberFormatException e){
               
        JOptionPane.showMessageDialog(null,"Digite apenas Numeros\n\n Erro: "+e);
       
        }
           
           switch(op){
           
               case 1:
                   
                   p.Cadastrar();
                   
               break;
               
               case 2:
                   
                   a.Cadastrar();
                   
               break;
               
               case 3:
                   
                   p.Exibir();
                   
               break;
               
               case 4:
                   
                   a.Exibir();
                   
               break;
               
               case 0:
                   
                   msg="Saindo...";
                   
                   io.SaidaDados(msg);
                   
               break;
               
               default:
                   
                   msg="Opção inválida";
                   
                   io.SaidaDados(msg);
                   
               break;
           
           }
       
       }while(op!=0);
           
    }
    
}
