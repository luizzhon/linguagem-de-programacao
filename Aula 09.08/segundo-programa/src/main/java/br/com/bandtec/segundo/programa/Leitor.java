/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.segundo.programa;


import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Leitor {
    
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Seja bem vindo "+ nome);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("A sua idade é: "+ idade);
     
        // nota: depois que o Scanner lê um número, e você tentar usar o
        // 'nextLine', ele irá passar direto pois ele trata o 'enter' que
        // você clicou como uma linha, e a nextLine ja o consome.
        
        // Solução: Dar um nextLine depois do número lido para limpar 
        // o ambiente ou crie outro leitor só para números.
        
    }
    
}
