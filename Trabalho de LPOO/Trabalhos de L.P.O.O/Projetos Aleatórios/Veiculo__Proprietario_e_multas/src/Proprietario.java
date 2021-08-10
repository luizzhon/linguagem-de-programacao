
import javax.swing.JOptionPane;



public class Proprietario {

    public String Nome;
    public int Telefone;
    public int Idade;



public void CadastrarProprietario(){

    this.Nome=JOptionPane.showInputDialog("Qual o Nome do Proprietário: ");
    this.Idade=Integer.parseInt(JOptionPane.showInputDialog("Qual a Idade do Proprietário: "));
    this.Telefone=Integer.parseInt(JOptionPane.showInputDialog("Qual o Telefone do Proprietário: "));
    
    }

public void ExibirProprietario(){

    String mens="Nome do Proprietário: "+this.Nome
               +"\nIdade Do Proprietário: "+this.Idade
               +"\nTelefone do Proprietário: "+this.Telefone;
    
    JOptionPane.showMessageDialog(null, mens);
    
    }
}