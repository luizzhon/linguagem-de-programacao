package com.br.bandtec.termometro;

public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    Double aumentaTemperatura(Double valor){
    
    if((temperaturaAtual + valor) > temperaturaMax){
    
        return null;
        
    }    
    
    }
}
