/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.exercicio.bilhete.unico;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o saldo do bilhete único: ");
        Double saldo = leitor.nextDouble();
        
        Double passagem_disponivel = saldo / 4.40;
        
//      Integer quantidadeInteiro = passagem_disponivel.intValue();
        
        System.out.println("\nO seu saldo é: "+ saldo +
                           "\nVocê ainda pode utilizar" +
                           " o metrô: "+ passagem_disponivel.shortValue() + " Vezes");
        
    }
}
