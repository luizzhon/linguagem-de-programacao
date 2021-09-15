package br.com.rony1533.exercicio4;

public class DescontoProgressivo {

    Double calcularDesconto(Double valor, Integer qtd){
    
        Double valorTotal = valor * qtd;
        
        return (valorTotal * qtd) / 10;
    
    }
    
    String exibirNotaFiscal(Double valor, Integer qtd, Double desconto){
    
        Double valorDesconto = (valor * qtd) - desconto;
        
        String msg = "-----------------------------"
                + "\nValor do produto: " + valor 
                + "\nQuantidade: "+ qtd
                + "\n-----------------------------"
                + "\nValor com desconto: "+ valorDesconto;
    
        return msg;
    }
    
}
