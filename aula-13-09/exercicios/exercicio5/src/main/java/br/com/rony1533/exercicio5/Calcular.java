package br.com.rony1533.exercicio5;

public class Calcular {

    Double calculaPesoIdeal(String sexo, Double altura){
    
        double peso = 0;
        
        if(sexo.equals("M")){
        
            peso = (62.1 * altura) - 44.7;
        
        }else{
        
            peso = (72.7 * altura) - 58;
        
        }
        
        return peso;
    
    }
    
}
