package com.br.bandtec.exercicio2;

public class TesteEmpregado {
    public static void main(String[] args) {
     
        Empregado empregado1 = new Empregado();
        
        empregado1.nome = "João";
        empregado1.salario = 5.400;
        empregado1.cargo = "Analista de Sistemas";
        
        System.out.println(String.format("Nome: %s \n"
                                        +"Cargo: %s \n"
                                        +"Salário: %.3f \n"
                                        +"Salário reajustado: %.3f",
                    empregado1.nome, empregado1.cargo, empregado1.salario,
                    empregado1.reajustarSalario(15)));
   
        Empregado empregado2 = new Empregado();
        
        empregado2.nome = "Daniel";
        empregado2.salario = 1.000;
        empregado2.cargo = "Estagiário";
        
        System.out.println("---------------------------");
        
        System.out.println(String.format("Nome: %s \n"
                                        +"Cargo: %s \n"
                                        +"Salário: %.3f \n"
                                        +"Salário reajustado: %.3f",
                    empregado2.nome, empregado2.cargo, empregado2.salario,
                    empregado2.reajustarSalario(10)));
        
    }
}
