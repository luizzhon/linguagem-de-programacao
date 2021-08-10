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
    
    //Sobrecarga com o mesmo número de parâmetros*/
    
    public static void Somar(int n1,int n2){
    
        int soma=n1+n2;
        System.out.println(soma);
       
    }
    
    public static void Somar(int n1, int n2, int n3){
    
        int soma=n1+n2+n3;
        System.out.println(soma);
    
    }
    public static void main(String[] args) {
        
        Somar(5,2,3);
        
    }
    
}
