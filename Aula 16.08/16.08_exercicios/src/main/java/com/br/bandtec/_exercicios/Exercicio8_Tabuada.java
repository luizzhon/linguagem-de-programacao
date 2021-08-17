package com.br.bandtec._exercicios;

import java.util.Scanner;

public class Exercicio8_Tabuada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer n1 = leitor.nextInt();
        
        String frase = "";
        
        for(int i = 0 ; i <= 10; i++){
        
            frase += n1 + " X "+ i +" = "+ (n1*i) + "\n";
        
        }
        
        System.out.println(frase);
        
    }
    
}
