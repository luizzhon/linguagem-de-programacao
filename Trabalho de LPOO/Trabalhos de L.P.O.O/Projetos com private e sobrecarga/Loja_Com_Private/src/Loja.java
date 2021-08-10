
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
public class Loja {
    
    public String Nome;
    public int Idade;
    private String Produtos;
    private String Endereco;
    
public void Cadastrar(){

    this.Nome=JOptionPane.showInputDialog("Qual o Nome dos Funcionários: ");
    this.Idade=Integer.parseInt(JOptionPane.showInputDialog("Qual a idade dos Funcionários: "));
    String Produ=JOptionPane.showInputDialog("Quais os produtos da Loja: ");
    String Ende=JOptionPane.showInputDialog("Qual o endereço da Loja: ");
    
    SetProdutos(Produ);
    SetEndereco(Ende);
    
}

public void Exibir(){

    String mens="Nome dos Funcionários: "+this.Nome
              + "\nIdade dos Funcionários: "+this.Idade
              + "\nProdutos da Loja: "+this.GetProdutos()
              + "\nEndereço da Loja: "+this.GetEndereco();
    
              JOptionPane.showMessageDialog(null, mens);
}

public String GetProdutos(){

return Produtos;

}

public void SetProdutos( String Produtos ){

this.Produtos = Produtos;

}

public String GetEndereco(){

return Endereco;

}

public void SetEndereco( String Endereco ){

this.Endereco = Endereco;

}



    
}
