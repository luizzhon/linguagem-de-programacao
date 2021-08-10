
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
public class Empresa {
    
    public String Nome;
    public String Endereco;
    private String Fundador;
    private int Idade;
    
public void Cadastrar(){

    this.Nome=JOptionPane.showInputDialog("Qual o Nome da empresa: ");
    this.Endereco=JOptionPane.showInputDialog("Qual o Endereço da empresa: ");
    String Fun=JOptionPane.showInputDialog("Qual o Fundador da empresa: ");
    int Id=Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da empresa : "));
    
    SetFundador(Fun);
    SetIdade(Id);
    
}

public void Exibir(){

    String mens="Nome da empresa: "+this.Nome
              + "\nEndereço da empresa: "+this.Endereco
              + "\nFundador da empresa: "+this.GetFundador()
              + "\nIdade da empresa: "+this.GetIdade();
    
              JOptionPane.showMessageDialog(null, mens);
}

public String GetFundador(){

return Fundador;

}

public void SetFundador( String Fundador ){

this.Fundador = Fundador;

}

public int GetIdade(){

return Idade;

}

public void SetIdade( int Idade ){

this.Idade = Idade;

}



    
}


