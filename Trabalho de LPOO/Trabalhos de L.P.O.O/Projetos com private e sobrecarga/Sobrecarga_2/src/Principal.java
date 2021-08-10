/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 525457252
 */
public class Principal {
    
    //Sobrecarga com número de parâmetros iguais, mas tipos de dados diferentes*/

    public static void Somar(int n1, int n2){
    
        int somar=n1+n2;
        System.out.println(somar);
        
    }
    
    public static void Somar(double n1, double n2){
    
        double somar=n1+n2;
        System.out.println(somar);
    
    }
    
    public static void Somar(String n1, String n2){
    
        String somar = n1+n2;
        System.out.println(somar);
    }
    
    public static void main(String[] args) {
        
        Somar(6.5,7.3);
        Somar(5,6);
        Somar("Edu", " O bom");
        
    }
    
}
