package br.com.bandtec.exercicio1;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1°Número: ");
        Double num1 = leitor.nextDouble();

        System.out.println("Digite o 2°Número: ");
        Double num2 = leitor.nextDouble();

        
        String soma = String.format("Soma: %.2f + %.2f = %.2f" 
                , num1, num2, (num1 + num2));
        
        String sub = String.format("Subtração: %.2f - %.2f = %.2f" 
                , num1, num2, (num1 - num2));
        
        String multi = String.format("Soma: %.2f x %.2f = %.2f" 
                , num1, num2, (num1 * num2));
        
        String divi = String.format("Divisão: %.2f / %.2f = %.2f" 
                , num1, num2, (num1 / num2));            
        
        if(num2 == 0){
         
            divi = "Não é possivel dividir por 0";
        
        }
        
        //System.out.println("Soma: "+ num1 + " + " + num2 + " = " + (num1 + num2));;
        System.out.println(soma);  
    
        //System.out.println("Subtração: "+ num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(sub);  
        
        //System.out.println("Divisão: "+ num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(divi);  

        //System.out.println("Multiplicação: "+ num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(multi);  
        
    }

}
