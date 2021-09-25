package com.br.bandtec.exercicio3;

public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double frete = 0.0;
    
    void calcularFrete(){
            
        switch (tamanho) {
            
            case "P":
                
                frete += (valorEncomenda * 1)/100;
                
                break;
                
            case "M":
                
                frete += (valorEncomenda * 3)/100;
                
                break;
                
            default:
                
                frete += (valorEncomenda * 5)/100;
                
                break;
                
        }
        
        if(distancia > 200){
        
            frete += 7;
        
        }else if(distancia > 50){
        
            frete += 5;
        
        }else {
        
            frete += 3;
        
        }
    
    }
    
    void emitirEtiqueta(){
    
        String exibirTamanho;
        
        switch (tamanho) {
            
            case "P":
                
                exibirTamanho = "Pequeno";
                
            break;
                
            case "M":
                
                exibirTamanho = "Médio";
                
            break;
                
            default:
                
                exibirTamanho = "Grande";
                
            break;
                
        }
        
        calcularFrete();
        
        System.out.println("***ETIQUETA PARA ENVIO***\n"
                +"\nEndereço do remetente: "+ enderecoRemetente
                +"\nEndereço do destinatário: "+ enderecoDestinatario
                +"\nTamanho: "+ exibirTamanho
                +"\n-------------------------\n"
                +"Valor da encomenda: R$ "+valorEncomenda
                +"Valor frete: R$ "+frete
                +"\n-------------------------\n"
                +"Valor total: R$ "+(valorEncomenda + frete));
                
    }
    
}
