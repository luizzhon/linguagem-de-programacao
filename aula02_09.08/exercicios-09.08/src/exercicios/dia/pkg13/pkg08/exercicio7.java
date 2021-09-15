//
//package exercicios.dia.pkg13.pkg08;
//
//import java.util.Scanner;
//
//public class exercicio7 {
//    
//    public static void main(String[] args) {
//    
//        Scanner leitor = new Scanner(System.in);
//        
//        System.out.println("Digite seu salário bruto");
//        Double wage_brut = leitor.nextDouble();
//        
//        Double inss = (wage_brut * 10) / 100;
//        Double ir = (wage_brut * 20) / 100;
//        
//        System.out.println("Digite o custo da condução de ida diariamente: ");
//        Double conduction_bus = leitor.nextDouble();
//        
//        Double vt = conduction_bus * 2 * 22;
//        
//        Double wage_liquid = wage_brut - (inss + ir + vt);
//        
//        String frase = String.format("Seu salário bruto é R$%f, tem um total"
//                + " de R$%f em descontos e receberá um líquido de R$%f"
//                , wage_brut, (inss + ir + vt), wage_liquid);
//        
//        System.out.println(frase);
//        
//    } 
//    
//}
