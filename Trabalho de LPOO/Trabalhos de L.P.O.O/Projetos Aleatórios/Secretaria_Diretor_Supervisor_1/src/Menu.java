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
        + "\n1-Cadastrar Secretaria"
        + "\n2-Cadastrar Diretor"
        + "\n3-Cadastrar Supervisor"
        + "\n4-Exibir Secretaria"        
        + "\n5-Exibir Diretor"
        + "\n6-Exibir Supervisor" 
        + "\n0-Sair";
        
        op=Integer.parseInt(JOptionPane.showInputDialog(mens));
        
        switch(op){
            
        case 1:
            
            a.CadastrarSecretaria();
            
        break;
        
        case 2:
            
            b.CadastrarDiretor();
            
        break;
        
        case 3:
            
            c.CadastrarSupervisor();
            
        break;
        
        case 4:
            
            a.ExibirSecretaria();
            
        break;
        
        case 5:
            
            b.ExibirDiretor
            
        break;
        
        case 6:
            
            c.ExibirSupervisor
            
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

