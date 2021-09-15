package br.com.rony1533.exercicio2;

public class ClassesSociais {

    Double salarioMinimo(Double renda){
    
        Double qtdSM = renda/1100;
        
        return qtdSM;
    
    }
    
    String definirClasse(Double renda, Double qtdSM){
    
        String classe = "";
        
        if(renda > 20900.01 && qtdSM >= 20){
        
            classe = "A";
        
        }else if(renda > 10450.01 && qtdSM >= 10){
        
            classe = "B";
            
        }else if(renda > 4180.01 && qtdSM >= 4){
        
            classe = "C";
        
        }else if(renda > 2090.01 && qtdSM >= 2){
        
            classe = "D";
        
        }else {
        
            classe = "E";
        
        }
        
        return classe;
    
    }
    
}
