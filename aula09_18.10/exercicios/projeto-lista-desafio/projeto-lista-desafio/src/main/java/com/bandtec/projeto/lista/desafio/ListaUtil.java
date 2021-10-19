package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }
    
// -----------------------------------------------------------------------------    
    
    public void add(Integer inteiro){
    
        if(inteiro != null){
        
            inteiros.add(inteiro);
        
        }
    }
    
// -----------------------------------------------------------------------------

    public void remove(Integer valor){
    
        if(valor != null){
        
            inteiros.remove(valor);
        
        }
    }

// -----------------------------------------------------------------------------

    public Integer count(){
    
        return inteiros.size();
    
    } 
    
// -----------------------------------------------------------------------------

    public Integer countPares(){
    
        Integer retornar = 0;
        
        if(inteiros.isEmpty()){
        
            retornar = 0;
        
        }else{
        
            for(Integer inteiro : inteiros) {
                
                if((inteiro % 2) == 0){
                
                    retornar++;
                
                }
            }
        }

        return retornar;

    }

// -----------------------------------------------------------------------------

    public Integer countImpares(){
    
        Integer retornar = 0;
        
        if(inteiros.isEmpty()){
        
            retornar = 0;
        
        }else{
        
            for (Integer inteiro : inteiros) {
                
                if((inteiro % 2) != 0){
                
                    retornar++;
                
                }
            }
        }

        return retornar;
    
    }

// -----------------------------------------------------------------------------    
    
    public Integer somar(){
    
        Integer retornar = 0;
        
        if(inteiros.isEmpty()){
        
            retornar = 0;
        
        }else{
        
            for(Integer inteiro : inteiros) {
                
                retornar+=inteiro;
                
            }
        
        }
    
        return retornar;
        
    }

// -----------------------------------------------------------------------------    
    
    public Integer getMaior(){
    
        Integer retornar = 0; 
        
        if(inteiros.isEmpty()){
        
            retornar = 0;
        
        }else{
            
            Integer vereficar = inteiros.get(0);
        
            for(Integer inteiro : inteiros) {
                
                if(inteiro > vereficar){ 
                    
                    retornar = inteiro; 
                
                }
                
            }
        }
    
        return retornar;
    
    }

// -----------------------------------------------------------------------------    

        public Integer getMenor(){
    
        Integer retornar = 0;
        Integer isMenor = inteiros.get(0);
        
        if(inteiros.isEmpty()){
        
            retornar = 0;
        
        }else{
        
            for (Integer inteiro : inteiros) {
                
                if(inteiro < isMenor){
                    
                    retornar = inteiro;
                
                }
                
            }
        }
    
        return retornar;
    
    }

// -----------------------------------------------------------------------------    

    public boolean hasDuplicidade(){
        
        boolean vereficar = false;
        
        for (Integer inteiro : inteiros) {
            
            for (Integer inteiro1 : inteiros) {
             
                if(inteiro == inteiro1){

                    vereficar = false;
                
                }else{
                
                    vereficar = true;
                
                }
                
            }
        }
    
        return vereficar;
    }
        
}
