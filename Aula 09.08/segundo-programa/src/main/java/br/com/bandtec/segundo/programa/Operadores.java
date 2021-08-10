package br.com.bandtec.segundo.programa;

/**
 *
 * @author Aluno
 */
public class Operadores {
    
    public static void main(String[] args) {
        
        // OPERADORES ARITMETICOS.
        
        /*
        
            São iguais aos operadores do JavaScript
            
            Soma: +
            Subtração: -
            Multiplicação: *
            Divisão: /
            incrementar: ++ ou +1
            Decrementar: -- ou -1
            numero += 10
            numero -= 10
            numero *= 10
        
        */
        
        Integer numero1 = 40;
        Integer numero2 = 20;
        
        System.out.println("A soma entre "+ numero1 + " e "+ numero2 + 
               ": " + (numero1 + numero2));
        
        System.out.println("A subtração entre "+ numero1 + " e "+ numero2 + 
               ": " + (numero1 - numero2));
        
        System.out.println("A multiplicação entre "+ numero1 + " e "+ numero2 + 
               ": " + (numero1 * numero2));
        
        System.out.println("A divisão entre "+ numero1 + " e "+ numero2 + 
               ": " + (numero1 / numero2));
        
    }
    
}
