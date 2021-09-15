package com.mycompany.exercicio6;

public class Vereficar {
    
    Boolean vereficarPrimo(Integer num){
    
        Boolean isPrimo = false;
        Integer result = 0;
        
        for(Integer i = 2 ; i <= num /2 ; i++){
        
            if(num % i == 0){
            
                result++;
                isPrimo = false;
                break;
            
            }
        }
        
        if(result == 0){
        
            isPrimo = true;
        
        }
        
        return isPrimo;
    
    }
    
}
