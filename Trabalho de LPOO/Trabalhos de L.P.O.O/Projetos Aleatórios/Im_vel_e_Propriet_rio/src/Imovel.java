
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
public class Imovel {
    
    public String Endereco;
    public Double Preco;
    public int Tamanho;
    
public void CadastrarImovel(){

    this.Endereco=JOptionPane.showInputDialog("Qual o Endereço do Imóvel: ");
    this.Preco=Double.parseDouble(JOptionPane.showInputDialog("Qual o Preço Do Imóvel"));
    this.Tamanho=Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do Imóvel (km²)"));
    
    }

public void ExibirImovel(){

    String mens = "Endereço do Imóvel: "+this.Endereco
                 +"\nPreço do Imóvel: "+this.Preco
                 +"\nTamanho do Imóvel: "+this.Tamanho+ " Km²";
    
    JOptionPane.showMessageDialog(null, mens );
}
    
}
