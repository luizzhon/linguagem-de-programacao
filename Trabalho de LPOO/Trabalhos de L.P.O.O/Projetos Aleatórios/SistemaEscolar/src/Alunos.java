
import javax.swing.JOptionPane;


public class Alunos {
    
    public String nome;
    public int Idade;
    public String Turma;
    
    public void CadastrarAluno(){
    
        this.nome=JOptionPane.showInputDialog("Nome do aluno: ");
        
        this.Idade=Integer.parseInt(JOptionPane.showInputDialog("Idade do Aluno: "));
        
        this.Turma=JOptionPane.showInputDialog("Turma do Aluno: ");
    
    }
    
    public void ExibirAluno(){
    
        String mens="Nome Do Aluno: "+this.nome+"\nIdade do Aluno: "+this.Idade+"\nTurma do Aluno: "+this.Turma;
        
        JOptionPane.showMessageDialog(null, mens);
    
    }
    
}
