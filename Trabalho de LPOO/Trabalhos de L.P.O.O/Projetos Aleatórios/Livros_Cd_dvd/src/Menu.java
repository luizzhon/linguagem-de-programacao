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
    Livros a = new Livros();
    CD b = new CD();
    DVD c = new DVD();
    int i=0;
    String mens="";
    
    public int op=1;
    public void op(){
    do{
        mens="Menu de Opções"
        + "\n1-Cadastrar Livro"
        + "\n2-Cadastrar CD"
        + "\n3-Cadastrar DVD"
        + "\n4-Exibir Livro"        
        + "\n5-Exibir CD"
        + "\n6-Exibir DVD" 
        + "\n0-Sair";
        
        op=Integer.parseInt(JOptionPane.showInputDialog(mens));
        
        switch(op){
            
        case 1:
            
            a.CadastrarLivros();
            
        break;
        
        case 2:
            
            b.CadastrarCD();
            
        break;
        
        case 3:
            
            c.CadastrarDVD();
            
        break;
        
        case 4:
            
            a.ExibirLivros();
            
        break;
        
        case 5:
            
            b.ExibirCD();
            
        break;
        
        case 6:
            
            c.ExibirDVD();
            
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

