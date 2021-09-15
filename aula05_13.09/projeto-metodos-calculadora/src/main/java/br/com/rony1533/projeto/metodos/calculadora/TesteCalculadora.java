package br.com.rony1533.projeto.metodos.calculadora;

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {
     
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        
//      Como o .format está esperando um integer, 
//      Eu posso chamar o método somar direto no format,
//      pois ele retorna Integer.
        System.out.println(String.format("Resultado: %d", calc.somar(40, 10)));
        
        String verefica = "";
        System.out.println("Digite um número:");
        Integer num = leitor.nextInt();
        
        if(calc.isPar(num)){
        
            verefica = "par";
        
        }else{
        
            verefica = "impar";
        
        }
        
        System.out.println(String.format("O %d é %s", num, verefica));
        
    }
}
