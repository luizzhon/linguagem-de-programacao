package br.com.bandtec.exercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        bolo1.sabor = "Morango";
        bolo1.valor = 30.0;
        
        bolo1.comprarBolo(50);
        
        bolo2.sabor = "Chocolate";
        bolo2.valor = 40.0;
        
        bolo2.comprarBolo(50);
        
        bolo3.sabor = "Abacaxi";
        bolo3.valor = 50.0;
        
        bolo3.comprarBolo(50);
        
        }
    }
