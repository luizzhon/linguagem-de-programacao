//
//package com.br.bandtec._exercicios;
//
//import java.util.Scanner;
//
//public class Exercicio10 {
//    
//    public static void main(String[] args) {
//        
//        Scanner leitor = new Scanner(System.in);
//        
//        Integer mussarela = 0, calabresa = 0, quatroQueijos = 0, i = 0;
//        String winner;
//        
//        do{
//        
//        System.out.println("|-----------------------------------------|\n"
//                          +"| Para votar em Mussarela digite 5        |\n"
//                          +"| Para votar em Calabresa digite 25       |\n" 
//                          +"| Para votar em Quatro Queijois digite 50 |\n"
//                          +"|                                         |\n"
//                          +"| Digite o valor da sua pizza favorita:   |\n"
//                          +"|_________________________________________|");
//        int valorPizza = leitor.nextInt();
//        
//        switch(valorPizza){
//            
//                case 5: 
//
//                    mussarela++;
//
//                break;
//
//                case 25:
//
//                    calabresa++;
//
//                break;
//
//                case 50:
//
//                    quatroQueijos++;
//
//                break;
//
//                default:
//
//                    System.out.println("valor inválido");
//
//                break;
//            
//            }  
//        
//            i++;
//            
//        }while(i != 10);
//        
//        if(mussarela > calabresa && mussarela > quatroQueijos){
//        
//            winner = "Mussarela";
//            
//        }else if(calabresa > mussarela && calabresa > quatroQueijos){
//        
//            winner = "Calabresa";
//        
//        }else{
//        
//            winner = "Quatro Queijos";
//            
//        }
//        
//        String frase = String.format("Contagem de votos\n\n"
//                                    +"Mussarela: %d\n"
//                                    +"Calabresa: %d\n"
//                                    +"Quatro Queijos: %d\n\n"
//                                    +"Sabor favorito entre os alunos: %s",
//                mussarela, calabresa, quatroQueijos, winner);
//        
//        System.out.println(frase);
//    }
//    
//}
