
package br.com.rony1533.exercicio3;

public class Classifica {
    
    void classificaIdade(Integer idade){
    
        if(idade >= 60){
        
            System.out.println("Idoso");
        
        }else if(idade >= 31){
        
            System.out.println("Adulto");
            
        }else if(idade >= 20){
        
            System.out.println("Jovem");
        
        }else if(idade >= 12){
        
            System.out.println("Adolescente");
            
        }else if(idade >= 3){
        
            System.out.println("Criança");
        
        }else{
        
            System.out.println("Bebê");
        
        }
        
    }
    
}
