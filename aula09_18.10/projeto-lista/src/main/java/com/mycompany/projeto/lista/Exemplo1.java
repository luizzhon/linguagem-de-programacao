package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    
    public static void main(String[] args) {
        
        // Vetores em java possuem tamanho fixo
        Integer[] inteiros = new Integer[10]; 
        String[] nomes = new String[5]; 
        
        Integer tamanho = inteiros.length;
        
        // 3 tipos de vetores mas com tamanho variavel
        // LIST 
        // MAP - Parecido com JSON, estrutura de chave e valor
        // SET
        
        List listaGenerica = new ArrayList();
        
        // Adiciona coisas na lista.
        // Pode adicionar qualquer objeto, ou seja integer, string, double, boolean etc
        // Essa lista tem um tipo genérico, pode aceitar qualquer coisa
        
        listaGenerica.add(10);
        listaGenerica.add("Diego");
        listaGenerica.add(1.83);
        listaGenerica.add(true);
        
        System.out.println(listaGenerica);
        
        // Lista é recomendado ter tipo, e você coloca o tipo entre os <>
        // Assim você litima o escopo, isso é considerado uma boa prática
        List<String> frutas = new ArrayList();
        
        frutas.add("Banana");
        frutas.add("Goiaba");
        frutas.add("Kiwi");
        frutas.add("Melancia");
        
        System.out.println("Antes do remove");
        System.out.println(frutas);
        
        // O remove, remove da lista, onde você tem que passar o índice.
        
        frutas.remove(0);
    
        System.out.println("Depois do remove");
        System.out.println(frutas);
        
        System.out.println("-----------------------------------");
        
        // O set, você passa o índice que deseja substituir, 
        // depois passa o valor que vai entrar nesse índice
        
        System.out.println("Antes do set");
        frutas.set(2, "Amora");
        
        System.out.println("Depois do set");

        System.out.println("-----------------------------------");

        // O add passando o índice primeiro, ele coloca o valor no índice passado
        // e move o que estava nesse índice para baixo
        
        System.out.println("Antes do add com índice");    
        frutas.add(2, "Jaca");
        
        System.out.println("Depois do add com índice");
    
        System.out.println("-----------------------------------");
        
        // Limpa a lista
        
        System.out.println("Antes de limpar a lista");
        frutas.clear();
        
        System.out.println("Depois de limpar a lista");
        
        System.out.println("------------------------------------");
        
        //Para ver o tamanho da lista
        
        System.out.println("Tamanho da lista: ");
        System.out.println(frutas.size());
    
        System.out.println("------------------------------------");
        
        // Percorrendo todos os índices da lista com o for clássico
        for(int i = 0 ; i < frutas.size(); i++){
            
            System.out.println("Percorrendo a lista com o for clássico");
            System.out.println("Fruta: "+ frutas.get(i));
        
        }
        
        System.out.println("------------------------------------");
        
        // Percorrendo todos os índices da lista com o for aprimorado ou ENHANCED
        for(String fruta : frutas){
           
            // O java tem um for, onde a cada vez que ele interar,
            // ele vai inserir na variavel 'fruta', do tipo da lista frutas
            
            System.out.println("Percorrendo a lista com o for aprimorado");
            System.out.println("Fruta: " + fruta);
        }
        
        System.out.println("------------------------------------");
    
        // Percorrendo todos os índices da lista com o foreach
       frutas.forEach(fruta -> {
    
        System.out.println("Percorrendo a lista com o foreach");
        System.out.println("Fruta: " + fruta);
       
       });
    }   
}