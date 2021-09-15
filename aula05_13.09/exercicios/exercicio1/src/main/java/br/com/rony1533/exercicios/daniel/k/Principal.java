
package br.com.rony1533.exercicios.daniel.k;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        System.out.println("Digite a primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota2 = leitor.nextDouble();
        System.out.println(String.format("A média das nota é %.2f", 
                calc.calcularMedia(nota1, nota2)));
        
    }
}
