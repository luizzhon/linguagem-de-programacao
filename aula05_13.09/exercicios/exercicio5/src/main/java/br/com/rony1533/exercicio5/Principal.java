package br.com.rony1533.exercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        Calcular cl = new Calcular();
        
        System.out.println("Digite seu gênero: ");
        String sexo = leitor.nextLine();
        
        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();
        
        System.out.println(String.format("Seu peso ideal é: %.2f",
                cl.calculaPesoIdeal(sexo, altura)));
        
    }
}
