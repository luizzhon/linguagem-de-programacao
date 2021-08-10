package br.com.bandtec.segundo.programa;

public class interpolacao {

    public static void main(String[] args) {
        
        String nome = "Daniel";
        Integer idade = 18; 
        Double altura = 1.70;
        
        // %s indica uma String     %d indica um integer      %f indica um double
        // os argumentos (que vem depois da primeira ' , ') tem q ser na ordem da String
        String frase = String.format("Meu nome é %s, tenho %d anos e %.2f de altura", nome, idade, altura);
        
        System.out.println(frase);
        
    }
    
}
