/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 525457252
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produtos al = new Produtos();
        
        Fornecedor el = new Fornecedor();
        
        el.CadastrarForn();
        
        al.CadastrarProd();
        
        el.ExibirForn();
        
        al.ExibirProd();
    }
    
}
