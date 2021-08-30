/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.daniel.katsuaki.c1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Loja {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer numDigit;

        System.out.println("Bem-Vindo Administrador!"
                + "Faça o controle de metas e estoque:\n\n"
                + "Quantidade de produtos em estoque: ");
        Integer qtdProdutos = leitor.nextInt();
                
        System.out.println("\nMeta de venda(%): ");
        Integer metaVendas = leitor.nextInt();
        
        Integer resultado = (qtdProdutos * metaVendas) / 100;
        
        System.out.println(String.format("\nPara atingir a meta,"
                + " você precisa vender %d produtos!", resultado));
        
        do{
            
        System.out.println("\nEscolha os proximos passos:\n"
                + "\n1 - Realizar Venda"
                + "\n2 - Sair");
        
        numDigit = leitor.nextInt();
        
        
        switch(numDigit){
        
            case 1:
                
                System.out.println("\nDigite a quantidade de produtos desejados:");
                Integer qtdDesejado = leitor.nextInt();
                
                while(qtdDesejado >= qtdProdutos){
                
                    System.out.println(String.format("\nInfelizmente não temos a"
                            + " quantidade de produtos digitada."
                            + "\nQuantidade: %d "
                            + "\nDigite uma quantidade válida: \n",qtdProdutos));
                    qtdDesejado = leitor.nextInt();
                    
                }
                
                for(Integer i = 1 ; i <= qtdDesejado ; i++){
                
                    System.out.println(String.format("Venda do %d°, restam %d no estoque"
                            ,i, (--qtdProdutos)));
                
                }
                
                System.out.println(qtdProdutos);
                
                System.out.println(String.format("\nVocê acabou de vender %d produtos"
                        + "(Sua meta é vender %d)", qtdDesejado, resultado));
                
            break;
            
            case 2:
                
                System.out.println("\nSaindo...");
                
            break;
        
        }
    
        }while(numDigit != 2);
    }
}
