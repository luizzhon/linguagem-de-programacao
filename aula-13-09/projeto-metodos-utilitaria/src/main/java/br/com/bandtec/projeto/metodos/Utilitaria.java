package br.com.bandtec.projeto.metodos;

public class Utilitaria {

//    Se nada está declarado no começo, significa que ele é "Public"
//    o "Public" identifica que todo mundo pode visualizar o método
//    ele é do tipo void (significa que não retorna nada)
//    O nome do método "exibirLinha"
    
    void exibirLinha(){
    
        System.out.println("--------------------");
    
    }
    
    void exibirNome(){
    
        System.out.println("Nome: Daniel");
    
    }
    
//  - Método que orquestra tudo
    void nomeDecorado(){
    
        exibirLinha();
        exibirNome();
        exibirLinha();
    
    }

//    - Usando "args" ou, argumentos
//    Descomente a linha 34 até 38 e a linha 43 até 49
//    Comente a linha 16 até a 20 e a linha 23 até 29
//    void exibirNome(String nomeQualquer){
//    
//    System.out.println(String.format("Nome: %s", nomeQualquer));
//    
//    }
    
//    - Método que orquestra tudo, mas usando "exibirNome" com "args"
//    Note que ele só precisa de argumentos, pois um de seus métodos
//    que ele invoca, necessita de um argumento, logo ele precisa também.
//    void nomeDecorado(String nome){
//    
//        exibirLinha();
//        exibirNome(nome);
//        exibirLinha();
//    
//    }
    
// Nota: Defina uma única responsabilidade para cada método.
    
}

