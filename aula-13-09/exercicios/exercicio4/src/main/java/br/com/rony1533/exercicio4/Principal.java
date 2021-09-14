package br.com.rony1533.exercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo dp = new DescontoProgressivo();
        
        System.out.println("Digite o valor unitário do Produto: ");
        Double valor = leitor.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        Integer qtd = leitor.nextInt();
        
        System.out.println(dp.exibirNotaFiscal(valor, qtd,
                dp.calcularDesconto(valor, qtd)));
        
    }
}
