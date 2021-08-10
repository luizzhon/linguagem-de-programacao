
import javax.swing.JOptionPane;


public class Vendedor {
    
    public String Nome;
    public int Rg;
    


public void CadastrarDados(){

    this.Nome=JOptionPane.showInputDialog("Digite seu Nome: ");
    this.Rg=Integer.parseInt(JOptionPane.showInputDialog("Digite seu Rg: "));

}

public void ExibirDados(){

    String mens="Dados Pessoais\n\n"
            + "Nome: "+this.Nome
            + "\nRg: "+this.Rg;
    
    JOptionPane.showMessageDialog(null, mens);
    
}
    }