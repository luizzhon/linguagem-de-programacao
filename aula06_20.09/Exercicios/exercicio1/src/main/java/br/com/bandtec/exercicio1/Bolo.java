package br.com.bandtec.exercicio1;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    
    void comprarBolo(Integer quantidade){
    
        if(quantidadeVendida + quantidade >= 100){
        
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            
        }else{
            
            quantidadeVendida += quantidade;
            
            exibirRelatorio(sabor, quantidadeVendida, valor);

        }
    }
    
    void exibirRelatorio(String sabor, Integer qtd, Double valor){
    
        System.out.println("O bolo sabor "+ sabor + ", foi comprado " +qtd+
                " vezes hoje, totalizando R$" + (valor * qtd));
    
    }
    
}
