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
public class Livros {
    
    public String Nome;
    public String Genero;
    public String Autor;
    
    
public void CadastrarLivros(){

    this.Nome=JOptionPane.showInputDialog("Qual o nome do livro: ");

    this.Genero=JOptionPane.showInputDialog("Qual o gênero do livro:");
    
    this.Autor=JOptionPane.showInputDialog("Qual o Autor do livro: ");
    
    }

public void ExibirLivros(){

    String mens="Nome do Livro: "+this.Nome
               +"\nGênero do Livro: "+this.Genero
               +"\nAutor do Livro: "+this.Autor;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}
