package com.br.bandtec.exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
     
        Encomenda encomenda = new Encomenda();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o endereço do remetende: ");
        encomenda.enderecoRemetente = leitor.nextLine();
        
        System.out.println("Digite o endereço do destinatário: ");
        encomenda.enderecoDestinatario = leitor.nextLine();
        
        System.out.println("Digite o tamanho do pacote: ");
        encomenda.tamanho= leitor.nextLine();
        
        System.out.println("Digite a distância: ");
        encomenda.distancia = leitor.nextDouble();
        
        System.out.println("Digite o valor da encomenda: ");
        encomenda.valorEncomenda = leitor.nextDouble();
        
        encomenda.emitirEtiqueta();      
        
    }
}
