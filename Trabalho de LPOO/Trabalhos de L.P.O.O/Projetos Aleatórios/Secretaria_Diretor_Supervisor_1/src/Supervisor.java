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
public class Supervisor {
    
    public String SetorSupervisionamento;
    public int Rg;
    public String Nome;
    
    
public void CadastrarSupervisor(){

    this.Nome=JOptionPane.showInputDialog("Qual o nome do Supervisor: ");

    this.Rg=Integer.parseInt(JOptionPane.showInputDialog("Qual o Rg do supervisor: "));
    
    this.SetorSupervisionamento=JOptionPane.showInputDialog("Qual o Salário do professor: ");
    
    }

public void ExibirSupervisor(){

    String mens="Nome do diretor: "+this.Nome
               +"Idade do diretor: "+this.Idade
               +"Slário do diretor: "+this.Salario;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}
