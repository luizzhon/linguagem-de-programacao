//
//package exercicios.dia.pkg13.pkg08;
//
//import java.util.Scanner;
//
//public class exercicio4 {
//    
//    public static void main(String[] args) {
//    
//        Scanner leitor = new Scanner(System.in);
//        
//        System.out.println("Digite quanto tempo (em minutos)"
//                + " você passou se aquecendo: ");
//        Integer timing_aq = leitor.nextInt();
//        
//        System.out.println("Digite quanto tempo (em minutos)"
//                + " você passou fazendo exercicios aeróbicos");
//        Integer timing_aero = leitor.nextInt();
//        
//        System.out.println("Digite quanto tempo (em minutos)"
//                + " você passou fazendo exercicios de musculação");
//        Integer timing_muscu = leitor.nextInt();
//        
//        Integer lost_calories_aq = timing_aq * 12; 
//        Integer lost_calories_aero = timing_aero * 20; 
//        Integer lost_calories_muscu = timing_muscu * 25;
//        
//        Integer lost_calories_tot = lost_calories_aero +
//                lost_calories_aq + lost_calories_muscu;
//        
//        String frase = String.format("Olá, Jorge. Você fez %d minutos de exercicios"
//                + " e perdeu cerca de %d calorias",
//                (timing_aero + timing_aq + timing_muscu), lost_calories_tot );
//        
//        System.out.println(frase);
//    } 
//    
//}
