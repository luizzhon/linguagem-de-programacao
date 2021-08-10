
import javax.swing.JOptionPane;


public class Menu {
    
    
        int i=0;
       String mens="";
       int op=1;
       Alunos a = new Alunos();
       Notas n = new Notas();
       
       public void op(){
    
       do{
           mens="Menu de Opções"
                   + "\n1-Cadastrar Aluno"
                   + "\n2-Exibir Aluno"
                   + "\n3-Cadastrar Notas"
                   + "\n4-Calcular Média"
                   + "\n5-Verificar Situação"
                   + "\n0-Sair";
           
           op=Integer.parseInt(JOptionPane.
                   showInputDialog(mens));
           
           switch(op){
               
               case 1:
                  
                   a.CadastrarAlunos();
                  
               break;
               
               case 2:
                   
                   a.ExibirAlunos();
                  
               break;
               
               case 3:
                   
                   n.CadastrarNotas();
                   
               break;
               
               case 4:
                   
                  n.CalcularMedia();

                   
               break;
               
               case 5:
                   
                   n.VerificarSituacao();
                   
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
