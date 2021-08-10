package br.com.bandtec.segundo.programa;

public class Condicionais {

    public static void main(String[] args) {
        
        String nome1 = "DanDan";
        String nome2 = "DanDan";
        
        //if(nome1 == nome2){ - quando estiver comparando String, se utiliza o  ' .equals() '
        if(nome1 .equals(nome2)){
        
            System.out.println("São iguais");
            
        }else{
        
            System.out.println("Não são iguais");
            
        }
        
        Boolean esta_ligado = true;
        
        // - Como o if está sempre perguntando se é true ou false, a variavel
        // booleano acaba sendo util, ja que ela só traz isso.
        
        if(esta_ligado){
        
            System.out.println("Está ligado");
        
        }else {
        
            System.out.println("Está desligado");
        
        }
        
    }
    
}
