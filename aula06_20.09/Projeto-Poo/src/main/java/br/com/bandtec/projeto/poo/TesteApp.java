/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.poo;

/**
 *
 * @author Aluno
 */
public class TesteApp {

    public static void main(String[] args) {
        
      //Criando um objeto    //Criando uma instância do objeto
        ContaCorrente conta1 = new ContaCorrente();
        
        //Acessando a classe "ContaCorrente" através do objeto "conta1",
        //e alterando os valores dos atributos que estão na classe "ContaCorrente"
        conta1.nomeTitular = "Daniel";
        conta1.saldo = 10.0;
        
        System.out.println("\nSaldo inicial de "+conta1.nomeTitular +": "+ conta1.saldo);
        
        ContaCorrente conta2 = new ContaCorrente();
        
        conta2.nomeTitular = "Daniel2";
        conta2.saldo = 10.5;
        
        System.out.println("\nSaldo inicial de "+conta2.nomeTitular +": "+ conta2.saldo);
        
        //nota se que os mesmos atributos da classe "contaCorrente"
        //e pode ser refenciado por vários objetos, por exemplo o "conta1" e "conta2"
        //e eles possuem os mesmos atributos, entretando valores diferentes.

        //Aqui é possivel ver que os valores estão armazenados na memória, conforme o obj
        //E eu posso manipulá-los, usando os métodos
        System.out.println("\nChamando o método depósito, da conta do "+conta1.nomeTitular+": ");
        conta1.depositar(10.0);
        
        System.out.println("\nChamando o método depósito, da conta do "+conta2.nomeTitular+": ");
        conta2.depositar(30.0);
        
        System.out.println("\n\nChamando o método sacar, da conta do "+conta1.nomeTitular+": ");
        conta1.sacar(5.5);
        
        System.out.println("\n\nChamando o método sacar, da conta do "+conta2.nomeTitular+": ");
        conta2.sacar(15.0);
    }

}
