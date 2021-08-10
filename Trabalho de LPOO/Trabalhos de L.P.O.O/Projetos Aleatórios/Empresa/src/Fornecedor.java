
import javax.swing.JOptionPane;


public class Fornecedor {

    public String Nome;
    public String End;
    public int TempoAtiv;
    
public void CadastrarForn(){

    this.Nome=JOptionPane.showInputDialog("Nome do Fornecedor: ");

    this.End=JOptionPane.showInputDialog("Endereço do Fornecedor: ");
    
    this.TempoAtiv=Integer.parseInt(JOptionPane.showInputDialog("Tempo de Atividade do Fornecedor: "));
}

public void ExibirForn(){

    String mens="Nome do Fornecedor: "+this.Nome+"\nEndereço do Fornecedor: "
            +this.End+"\nTempo de Atividade do Fornecedor: "+this.TempoAtiv;
    
    
        JOptionPane.showMessageDialog(null, "Informações sobre o fornecedor\n\n"+ mens);
}
    
}
