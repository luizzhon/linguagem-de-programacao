
import javax.swing.JOptionPane;


public class Aluno extends Pessoas {
    
    public String curso;
    public String Turma;
    public String msg;
    
    EntradaSaida io = new EntradaSaida();
    Conversor conv = new Conversor();
    
    public void Cadastrar(){
    
        msg="Digite seu nome: ";
        
    this.Nome = io.EntradaDados(msg);
    
    try{

        msg="Digite seu registro: ";
           
    this.Registro = conv.StringToInt(io.EntradaDados(msg));
    
                } catch (NumberFormatException e){
                
       JOptionPane.showMessageDialog(null,"Apenas Numeros - erro: "+e);
       
      }
    
        msg="Digite seu curso: ";
        
    this.curso = io.EntradaDados(msg);
    
        msg="Digite sua turma: ";
        
    this.Turma = io.EntradaDados(msg);

    }
    
    public void Exibir(){
    
    msg="Dados do Aluno\n"
       +"\nNome: "+this.Nome
       +"\nRegistro: "+this.Registro
       +"\nCurso: "+this.curso
       +"\nTurma: "+this.Turma;
    
    io.SaidaDados(msg);
    
    }
    
}
