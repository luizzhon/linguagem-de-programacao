package br.com.bandtec.colaborador.recursos.humanos;

public class TesteColaborador {

    public static void main(String[] args) {
     
        Colaborador colaborador1 = new Colaborador("Daniel", "Estagiario", 1000.0);
        Colaborador colaborador2 = new Colaborador("Claudio", "Analista 1", 5000.0);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colaborador1);
        System.out.println("--------------------------");
        System.out.println(colaborador2);
        
        System.out.println("Promoção do colaborador "+ colaborador1.getNome() + 
        "\nStatus da operação: " + rh.promoveColaborador(colaborador1, "Analista 1", 5000.0));
        
        System.out.println();
        
        System.out.println("Promoção do colaborador "+ colaborador2.getNome() +
        "\nStatus da operação: " + rh.promoveColaborador(colaborador2, "Analista 2", 4000.0));
        
        rh.reajustarSalario(colaborador1, 20.0);
        
        System.out.println(colaborador1);
        System.out.println("--------------------------");
        System.out.println(colaborador2);
        
        System.out.println("Total de promovidos: " + rh.getTotalPromovidos());
        
        System.out.println("Total de salários reajustados: " + rh.getTotalSalariosAjust());
    }
}
