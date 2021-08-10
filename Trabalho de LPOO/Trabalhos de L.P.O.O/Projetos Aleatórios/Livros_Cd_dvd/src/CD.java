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
public class CD {
    
    public String EstiloMusica;
    public String TituloMusica;
    public String AutorMusica;
    
    
public void CadastrarCD(){

    this.EstiloMusica=JOptionPane.showInputDialog("Qual o estilo da musica: ");

    this.TituloMusica=JOptionPane.showInputDialog("Qual o titulo da musica:");
    
    this.AutorMusica=JOptionPane.showInputDialog("Qual o Autor da musica: ");
    
    }

public void ExibirCD(){

    String mens="Estilo da musica:: "+this.EstiloMusica
               +"\nTitulo da musica: "+this.TituloMusica
               +"\nAutor da musica: "+this.AutorMusica;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}

