//
//package exercicios.dia.pkg13.pkg08;
//
//import java.util.Scanner;
//
//public class exercicio8_Elevador {
//    
//    public static void main(String[] args) {
//    
//        Scanner leitor = new Scanner(System.in);
//        
//        System.out.println("Digite o peso limite do elevador: ");
//        Double limit_weight = leitor.nextDouble();
//        
//        System.out.println("Digite o número limite de pessoas no elevador: ");
//        Integer limit_people = leitor.nextInt();
//        
//        System.out.println("Digite o peso da 1°Pessoa que entrou no elevador: ");
//        Double weight1 = leitor.nextDouble();
//        
//        System.out.println("Digite o peso da 2°Pessoa que entrou no elevador: ");
//        Double weight2 = leitor.nextDouble();
//        
//        System.out.println("Digite o peso da 3°Pessoa que entrou no elevador: ");
//        Double weight3 = leitor.nextDouble();
//        
//        Double weight_tot = weight1 + weight2 + weight3;
//        
//        String frase = String.format("Entraram 3 pessoas no elevador,"
//                + " no qual cabem %d pessoas."
//                + "\nO peso total do elevador é de %f, "
//                + "sendo que ele suporta %f", limit_people, weight_tot, limit_weight);
//        
//        System.out.println(frase);
//        
//    }
//    
//}
