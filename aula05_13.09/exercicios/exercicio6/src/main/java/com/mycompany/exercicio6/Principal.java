package com.mycompany.exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Vereficar ve = new Vereficar();
        Boolean verefica = false;
        
        System.out.println("Digite um número: ");
        Integer num = leitor.nextInt();
        
        verefica = ve.vereficarPrimo(num);
        
        if(verefica){
        
            System.out.println("O número "+ num +" é primo");
        
        }else{
        
            System.out.println(String.format("O número %d não é primo", num));
        
        }
        
    }
}
