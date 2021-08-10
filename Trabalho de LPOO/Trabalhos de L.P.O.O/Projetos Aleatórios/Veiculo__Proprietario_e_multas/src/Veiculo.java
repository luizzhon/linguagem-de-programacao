
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
public class Veiculo {
    
    public int Km;
    public String modelo;
    public double Preco;
    
    
public void CadastrarVeiculo(){

    this.Km=Integer.parseInt(JOptionPane.showInputDialog("Quantos Quilomêtros rodados tem seu carro: "));

    this.modelo=JOptionPane.showInputDialog("Qual o Modelo do seu carro:");
    
    this.Preco=Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do seu veiculo: "));
    
    }

public void ExibirVeiculo(){

    String mens="Quilomêtros rodados:: "+this.Km
               +"\nModelo do veiculo: "+this.modelo
               +"\nPreço do veiculo: "+this.Preco;
    
    JOptionPane.showMessageDialog(null, mens);



    }
}
