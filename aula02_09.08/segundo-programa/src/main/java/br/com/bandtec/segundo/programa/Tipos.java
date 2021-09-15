package br.com.bandtec.segundo.programa;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Tipos {
    
    public static void main(String[] args) {
        
//      Comentarios no netbeans
   
//      O Java possui tipagem estática,
//      se você declaram uma váriavel em um tipo, ela nasce e morre neste tipo.
        
        String texto = "kkkkkkkkkkkkkk333";      // nota: aspas duplas.
        int numero = 7;         // nota: sem aspas.
        float flutuante = 7.55f;        // nota: sem aspas e um 'f' no final.
        char k = 'k';       // nota: aspas simples.
        Double decimal = 10.54; //Ponto flutuante + casas decimais
        
        Boolean esta_ligado = true;
        Boolean isProfessor = false;
        Boolean isMaior = decimal < 10;    //faz uma compação antes de retornar.
        
        
        System.out.println("String: "+ texto + 
                         "\nNumero: "+ numero +
                         "\nFloat: "+ flutuante +
                         "\nChar: "+ k +
                         "\nDouble: "+ decimal +
                         "\nBoolean - está ligado? " + esta_ligado +
                         "\nBoolean - é professor? "+ isProfessor+ 
                         "\nBoolean - é maior? "+ isMaior);
        
        // classe Wrapper - sempre usar esse
        Integer numero1;
        
        // tipo primitivo
        int numero2;
        
    }
    
}


