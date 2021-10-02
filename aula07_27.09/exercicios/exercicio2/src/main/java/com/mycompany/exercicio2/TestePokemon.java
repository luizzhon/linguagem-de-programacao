package com.mycompany.exercicio2;

public class TestePokemon {
    
    public static void main(String[] args) {
     
        Pokemon pokemon1 = new Pokemon("Pikachu", "Elétrico", 100.0);
        Pokemon pokemon2 = new Pokemon("Metapod", "Planta", 10.0); 
        
        TreinadorPokemon Daniel = new TreinadorPokemon("Daniel");
        
        Daniel.treinarPokemon(pokemon1);
        Daniel.treinarPokemon(pokemon1);
        Daniel.treinarPokemon(pokemon1);
        Daniel.treinarPokemon(pokemon1);
        Daniel.treinarPokemon(pokemon1);

        System.out.println(pokemon1.toString());
        
        System.out.println(Daniel.evoluirPokemon(pokemon1, "Raichu"));    
        
        System.out.println(pokemon1.toString());    
        
        Daniel.treinarPokemon(pokemon2);
        Daniel.treinarPokemon(pokemon2);
        
        pokemon2.toString();
        
        System.out.println(Daniel.evoluirPokemon(pokemon2, "Venomoth"));    
        
        System.out.println(Daniel.toString());   
        
    }
}
