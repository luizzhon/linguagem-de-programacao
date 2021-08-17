//package com.br.bandtec._exercicios;
//
//import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Exercicio7_Sorteio {
//
//    public static void main(String[] args) {
//        
//    Scanner leitor = new Scanner(System.in);
//     
//    System.out.println("Digite um número de 1 a 100");
//    Integer numDigit = leitor.nextInt();
//    Boolean verefica = true;
//    
//    Integer numFirst = 0;
//    Integer contNumPar = 0;
//    Integer contNumImpar = 0;
//    
//    for(int i = 0; i < 200 ; i++){
//    
//        Integer numSorteado = ThreadLocalRandom.current().nextInt(1, 100);
//        
//        if(numSorteado == numDigit && verefica == true){
//        
//            numFirst = i;
//            verefica = false;
//        
//        }
//        
//        if(numSorteado % 2 == 0){
//        
//            contNumPar++;
//            
//        }else{
//        
//            contNumImpar++;
//        
//        }
//    
//    }
//    
//        String frase = String.format("O seu número escolhido foi %d"
//                + "\nEle foi sorteado na %d tentativa"
//                + "\nForam sorteados %d números pares"
//                + "\nForam sorteados %d números ímpares",
//                numDigit, numFirst, contNumPar, contNumImpar);
//    
//        System.out.println(frase);
//        
//    }
//}
