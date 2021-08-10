
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo.ferreira
 */
public class ListFunc {
    
    ArrayList<Funcionario> func = new ArrayList<Funcionario>();
    
    public void Cadastrar(String nm,int idade,double sal){
        func.add(new Funcionario(nm,idade,sal));
        JOptionPane.showMessageDialog(null,"Cadastro Realizado");
    }
    
    public void Listar(){
        String dados="";
        for(Funcionario elemento:func){
            dados+=elemento.getNome()+"-"+elemento.getIdade()+"-"+
                    elemento.getSalario()+"\n";
        }
        JOptionPane.showMessageDialog(null,dados+"\nElementos"+func.size());
        
    }
    
    public void Excluir(String nm){
        if(!nm.equals("")){
            for(int i=0;i<func.size();i++){
                if(func.get(i).getNome().equals(nm)){
                    func.remove(i);
                    JOptionPane.showMessageDialog(null,"Cadastro excluido !!!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Campo nome em branco !!");
        }
        
    }
}
