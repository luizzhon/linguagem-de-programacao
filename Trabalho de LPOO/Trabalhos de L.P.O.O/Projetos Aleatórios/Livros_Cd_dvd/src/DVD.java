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
public class DVD {
    
    public String TituloConteudo;
    public String CategoriaConteudo;
    public String DiretorConteudo;
    
    
public void CadastrarDVD(){

    this.TituloConteudo=JOptionPane.showInputDialog("Qual o titulo do filme: ");

    this.CategoriaConteudo=JOptionPane.showInputDialog("Qual a categoria do filme:");
    
    this.DiretorConteudo=JOptionPane.showInputDialog("Qual o Diretor do Filme: ");
    
    }

public void ExibirDVD(){

    String mens="Titulo do Filme:: "+this.TituloConteudo
               +"\nCategoria do filme: "+this.CategoriaConteudo
               +"\nDiretor do filme: "+this.DiretorConteudo;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}

