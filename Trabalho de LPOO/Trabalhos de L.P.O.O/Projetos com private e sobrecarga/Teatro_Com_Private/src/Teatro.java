
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 525457252
 */
public class Teatro {
    
    public String endereco;
    public Double Ingresso;
    private int Idade;
    private String Atores;
    
public void Cadastrar(){

    this.endereco=JOptionPane.showInputDialog("Qual o endereço do Teatro: ");
    this.Ingresso=Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do Ingresso do Teatro: "));
    String Ator=JOptionPane.showInputDialog("Qual o Nome dos atores/Atrizes do Teatro: ");
    int id=Integer.parseInt(JOptionPane.showInputDialog("Qual a idade dos Atores/Atrizes do Teatro: "));
    
    SetAtores(Ator);
    SetIdade(id);
    
}

public void Exibir(){

    String mens="Endereço do Teatro: "+this.endereco
              + "\nPreço do Ingresso: "+this.Ingresso
              + "\nNome dos Atores/Atrizes: "+this.GetAtores()
              + "\nIdade dos Atores/Atrizes: "+this.GetIdade();
    
              JOptionPane.showMessageDialog(null, mens);
}

public String GetAtores(){

return Atores;

}

public void SetAtores( String Atores ){

this.Atores = Atores;

}

public int GetIdade(){

return Idade;

}

public void SetIdade( int Idade ){

this.Idade = Idade;

    }
}
