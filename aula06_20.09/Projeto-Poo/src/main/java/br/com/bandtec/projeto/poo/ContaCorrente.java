package br.com.bandtec.projeto.poo;

public class ContaCorrente {

    // Criando os atributos da conta = caracteristicas
    
    String nomeTitular;
    Double saldo;
  
    
    //Método de depositar da contaCorrente;
    void depositar(Double valor){
        System.out.println("Saldo antes do depósito: "+ saldo);
        saldo += valor;
        System.out.println("Saldo depois do depósito: "+ saldo);
    }
    
    void sacar(Double valor){
        
        System.out.println("Saldo antes do saque: "+ saldo);
        saldo -= valor;
        System.out.println("Saldo depois do saque: "+ saldo);
    
    }
    
}
