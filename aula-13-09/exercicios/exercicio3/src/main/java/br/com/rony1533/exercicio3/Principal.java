package br.com.rony1533.exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        Classifica cl = new Classifica();
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        System.out.println("Sua idade está classificada como: ");
        cl.classificaIdade(idade);
        
    }
}
