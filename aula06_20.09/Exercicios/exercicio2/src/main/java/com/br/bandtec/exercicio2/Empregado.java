package com.br.bandtec.exercicio2;

public class Empregado {

    String nome;
    String cargo;
    Double salario;
    
    Double reajustarSalario(Integer porceReajuste){
    
    Double valorReajuste = (salario * porceReajuste)/100;
    
    salario = salario + valorReajuste;
    
    return salario;
    
    }
    
}
