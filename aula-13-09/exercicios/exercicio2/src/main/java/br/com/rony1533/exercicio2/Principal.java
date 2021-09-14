package br.com.rony1533.exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        ClassesSociais cs = new ClassesSociais();
        
        System.out.println("Digite sua renda");
        Double renda = leitor.nextDouble();
        
        System.out.println(String.format("Você recebe aproximadamente %.1f "
                + "Sálarios Mínimos.",cs.salarioMinimo(renda)));
        
        System.out.println(String.format("Você pertence a classe social: %s",
                cs.definirClasse(renda, cs.salarioMinimo(renda))));
        
    }
}
