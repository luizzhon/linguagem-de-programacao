package com.br.bandtec.termometro;

public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    void aumentaTemperatura(Double valor){
    
    if((temperaturaAtual + valor) > temperaturaMax){
    
        temperaturaMax = temperaturaAtual + valor;
        
    }else{
    
        temperaturaAtual += temperaturaAtual + valor;
    
    }
    
    }
    
    void diminuiTemperatura (Double valor){
        
    if((temperaturaAtual + valor) < temperaturaMin){
    
        temperaturaMin = temperaturaAtual + valor;
    
    }else{
    
        temperaturaAtual += temperaturaAtual + valor;
    
    }
    
    }
    
    void exibeFahreinheit (){
    
        Double temperaturaFahreinheit = (temperaturaAtual * 9/5) + 32;
        
        System.out.println("Temperatura atual em Celsius: "+temperaturaAtual
                         + "\nTemperatura atual em Fahreinheit: "+temperaturaFahreinheit);
        
    }
    
}
