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
        
        if(!(inteiros.isEmpty())){
        
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
        
        if(!(inteiros.isEmpty())){
        
            for(Integer inteiro : inteiros) {
                
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
        
        if(!(inteiros.isEmpty())){
        
            for(Integer inteiro : inteiros) {
                
                retornar+=inteiro;
                
            }
            
            return retornar;
        
        }
    
        return retornar;
        
    }

// -----------------------------------------------------------------------------    
    
    public Integer getMaior(){

        if(!(inteiros.isEmpty())){
        
            Integer isMaior = inteiros.get(0);
        
            for(Integer inteiro : inteiros) {
                
                if(inteiro > isMaior){ 
                    
                    isMaior = inteiro; 
                
                }
            }
            
            return isMaior;
        
        }
    
        return 0;
    
    }

// -----------------------------------------------------------------------------    

    public Integer getMenor(){
        
        if(!(inteiros.isEmpty())){
       
            Integer isMenor = inteiros.get(0);
            
             for (Integer inteiro : inteiros) {
                
                if(inteiro < isMenor){
                    
                    isMenor = inteiro;
                
                }
            }
            
            return isMenor;
            
        }
    
        return 0;
    
    }

// -----------------------------------------------------------------------------    

    public boolean hasDuplicidade(){
        
        Integer i = 1;
        
        for (Integer inteiro : inteiros) {
            
            for ( ; i < inteiros.size() ; i++) {
                
                if(inteiro.equals(inteiros.get(i))){

                    return true;
                
                }
            }
            i++;
        }
    
        return false;
        
    }
    
// -----------------------------------------------------------------------------
    
}
