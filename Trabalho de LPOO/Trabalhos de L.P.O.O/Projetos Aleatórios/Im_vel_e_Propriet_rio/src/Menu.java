/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author 530445542
 */
public class Menu {
    Imovel a = new Imovel();
    Proprietario b = new Proprietario();
    int i=0;
    String mens="";
    public int op=1;
    public void op(){
    do{
        mens="Menu de Opções"
        + "\n1-Cadastrar Imóvel"
        + "\n2-Cadastrar Proprietário"
        + "\n3-Exibir Imóvel"
        + "\n4-Exibir Proprietário"
        + "\n0-Sair";
        
        op=Integer.parseInt(JOptionPane.showInputDialog(mens));
        
        switch(op){
            
        case 1:
            
            a.CadastrarImovel();
            
        break;
        
        case 2:
            
            b.CadastrarProprietario();
            
        break;
        
        case 3:
            
            a.ExibirImovel();
            
        break;
        
        case 4:
            
            b.ExibirProprietario();
            
        break;
        
        case 0:
            
            JOptionPane.showMessageDialog(null,"Saindo...");
            
        break;
        
        default:
            
            JOptionPane.showMessageDialog(null,"Opção Inválida");
            
        break;
        
            }
        }while(op!=0);
    }
}

