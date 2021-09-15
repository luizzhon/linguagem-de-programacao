
package exercicios.dia.pkg13.pkg08;

import java.util.Scanner;

public class exercicio10_idade {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = leitor.nextLine();
        
        System.out.println("Olá "+name+ "! Qual o ano do seu nascimento?");
        Integer year = leitor.nextInt();
        
        Integer age = (2021 - year) + 9;
        
        System.out.println("Em 2030 você terá "+ age);
        
    }
}
