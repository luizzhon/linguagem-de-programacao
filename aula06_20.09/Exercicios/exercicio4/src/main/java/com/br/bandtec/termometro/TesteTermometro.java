package com.br.bandtec.termometro;

public class TesteTermometro {

    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();
        
        termometro.temperaturaAtual = 20.0;
        termometro.temperaturaMax = 35.0;
        termometro.temperaturaMin = 2.0;
        
        termometro.aumentaTemperatura(20.0);
        
        System.out.println(termometro.temperaturaMax);
        termometro.exibeFahreinheit();
        
    }
    
}
