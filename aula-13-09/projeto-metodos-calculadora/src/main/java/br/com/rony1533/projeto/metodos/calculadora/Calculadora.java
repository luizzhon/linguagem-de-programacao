package br.com.rony1533.projeto.metodos.calculadora;

public class Calculadora {
    
//    Agora este método é do tipo integer
//    note que este método recebe dois argumentos
//    e depois faz a soma usando os argumentos, e guarda na variavel "soma"
//    e ele retorna o valor dessa variavel
//    para ser usada para quem vai invocar ela.
    Integer somar(Integer num1, Integer num2){
    
        Integer soma = num1 + num2;
        
        return soma;
    
    }
    
    
//    Sobrecarga de método, você redeclara o mesmo método
//    Mas troca o seu tipo ou seus argumentos,
//    No caso abaixo ele tem argumentos diferentes.
    Integer somar(Integer num1, Integer num2, Integer num3){
    
        Integer soma = num1 + num2 + num3;
        
        return soma;
    
    }
    
//    No caso abaixo, é uma sobrecarga com tipo diferente.
    Double somar(Double num1, Double num2, Double num3){
    
        Double soma = num1 + num2 + num3;
        
        return soma;
    
    }
    
    Boolean isPar(Integer num1){
    
        return (num1 % 2) == 0;
        
    }
    
//    O java vai te dar 3 opções na hora que você chamar a classe, 
//    com esses 3 métodos, onde ele defini o que você vai usar,
//    dependendo do que você passa para ele
//    Por exemplo: Se você passar dois argumentos para o método, ele vai saber
//    que você vai usar o método onde o "somar" está declarado com 2 argumentos
//    Mas se você passar 3 argumentos com valores double, ele vai saber que você
//    vai usar o método "somar" com 3 argumentos e do tipo double.
}
