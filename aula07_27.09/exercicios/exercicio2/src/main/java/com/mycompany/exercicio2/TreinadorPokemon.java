package com.mycompany.exercicio2;

public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        
        this.nome = nome;
        this.nivel = 1;

    }
    
    public void treinarPokemon(Pokemon pokemon){
    
        Double forcaPokemon = pokemon.getForca() +(pokemon.getForca() * 10)/100;
        
        pokemon.setDoces(pokemon.getDoces() + 10);
        pokemon.setForca(forcaPokemon);
        nivel += 2;
    
    }

    public String evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
    
        String msg;
        
        if(pokemon.getDoces() >=50 ){
        
            String nomePokemon = pokemon.getNome();
            
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
           
            msg = "Pokemón "+ nomePokemon + " evoluiu para -> "+ pokemon.getNome();
        }else{
        
            msg = "Não foi possivel realizar a operação, doces insuficientes";
            
        }
        
        return msg;
    
    }

    public String toString() {
        return "TreinadorPokemon " + nome + "\nnivel: " + nivel;
    }
    
}
