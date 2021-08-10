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
public class Diretor {
    
    public String Nome;
    public int Idade;
    public Double Salario;
    
    
public void CadastrarDiretor(){

    this.Nome=JOptionPane.showInputDialog("Qual o nome do diretor: ");

    this.Idade=Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do professor: "));
    
    this.Salario=Double.parseDouble(JOptionPane.showInputDialog("Qual o Salário do professor: "));
    
    }

public void ExibirDiretor(){

    String mens="Nome do diretor: "+this.Nome
               +"Idade do diretor: "+this.Idade
               +"Slário do diretor: "+this.Salario;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}
