
import javax.swing.JOptionPane;


public class Alunos {
    
    public String Nome;
    public String Turma;
    

public void CadastrarAlunos(){

    this.Nome=JOptionPane.showInputDialog("Digite Seu Nome: ");
    this.Turma=JOptionPane.showInputDialog("Digite sua Turma: ");

    }

public void ExibirAlunos(){

    String mens="Nome do Aluno: "+this.Nome
             +"\nTurma do Aluno: "+this.Turma;
    
    JOptionPane.showMessageDialog(null, mens );
    
    }
}