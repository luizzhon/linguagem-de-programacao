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
public class Multa {
    
    public int Data;
    public String Causa;
    public double Valor;
    
    
public void CadastrarMulta(){

    this.Data=Integer.parseInt(JOptionPane.showInputDialog("Qual a data da multa: "));

    this.Causa=JOptionPane.showInputDialog("Qual a Causa multa:");
    
    this.Valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da multa: "));
    
    }

public void ExibirMulta(){

    String mens="Data da multa:: "+this.Data
               +"\nValor da multa: "+this.Valor
               +"\nCausa da multa: "+this.Causa;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}
