//package com.br.bandtec._exercicios;
//
//import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Exercicio1 {
//
//    public static void main(String[] args) {
//        
//        Integer numRandom;
//        Integer numDigit;
//        Integer cont = 0;
//        
//        do {
//            
//        Scanner leitor = new Scanner(System.in);
//        
//        System.out.println("Digite um número de 1 a 10: ");
//        numDigit = leitor.nextInt();
//        
//        numRandom = ThreadLocalRandom.current().nextInt(1, 11);;
//        
//        System.out.println("O numero sorteado foi: "+ numRandom);
//        cont++;
//        
//        } while (numDigit != numRandom);
//    
//        if(cont <= 3){
//        
//            System.out.println("Você é MUITO sortudo");
//            
//        }else if(cont <= 10){
//        
//            System.out.println("Você é sortudo");
//        
//        }else{
//        
//            System.out.println("É melhor você parar de apostar e ir trabalhar"
//                    + "\nVocê teve "+cont +" tentativas");
//        
//        }
//    }
//}
