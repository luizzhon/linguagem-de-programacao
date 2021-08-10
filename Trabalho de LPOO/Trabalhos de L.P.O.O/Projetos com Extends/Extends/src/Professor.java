
import javax.swing.JOptionPane;


public class Professor extends Pessoas {
    
    public String Especialidade;
    public int nAlunos;
    public String msg;
    
    EntradaSaida io = new EntradaSaida();
    Conversor conv = new Conversor();
    
    public void Cadastrar(){
        
        msg="Digite seu Nome";
        
    this.Nome = io.EntradaDados(msg);
    
        try{
    
        msg="Digite seu Registro";
    
    this.Registro = conv.StringToInt(io.EntradaDados(msg));
        
        } catch (NumberFormatException e){
            
       JOptionPane.showMessageDialog(null,"Digite apenas Numeros \n\nErro: "+e);
       
      }
    
        msg="Digite sua Especialidade";
    
    this.Especialidade = io.EntradaDados(msg);
    
        try{ 

            msg="Digite o número de alunos";
        
    this.nAlunos = conv.StringToInt(io.EntradaDados(msg));
    
        } catch (NumberFormatException e){
            
       JOptionPane.showMessageDialog(null,"Digite apenas Numeros \n\nErro: "+e);
       
      }
    }
    
    public void Exibir(){
    
        msg="Dados do Professor\n"
           +"\nNome: "+this.Nome
           +"\nRegistro: "+this.Registro
           +"\nEspecialidade: "+this.Especialidade
           +"\nNúmero de alunos: "+this.nAlunos;
        
        io.SaidaDados(msg);
    
    }
    
}
