package br.com.bandtec.encapsulamento;

public class TesteAluno {

    public static void main(String[] args) {
        
          Aluno aluno1 = new Aluno("#123", "Daniel K", "ADS");

//        -- v1 - usando public --
//        -- Você mexe direto nos atributos, o que acaba não sendo seguro --
//------------------------------------------------------------------------------
//
//        aluno1.ra = "#123";
//        aluno1.nome = "Daniel K";
//        aluno1.curso = "ADS";
//        aluno1.nota1 = 8.0;
//        aluno1.nota2 = 7.6;
//                
//        System.out.println("RA: "+ aluno1.ra);
//        System.out.println("Nome: "+ aluno1.nome);
//        System.out.println("Curso: "+ aluno1.curso);
//        System.out.println("nota 1: "+ aluno1.nota1);
//        System.out.println("nota 2: "+ aluno1.nota2);
//        System.out.println("Média: "+ (aluno1.nota1 + aluno1.nota2)/2);

//      -- v2 - usando private --
//      -- Você se utiliza de métodos para alterar e pegar os atributos --
//      -- E os métodos é os unicos que podem acessar esses atributos --
//      -- pois eles estão privados a classe --
//------------------------------------------------------------------------------
//
//        aluno1.setRa("#123");
//        aluno1.setNome("Daniel K");
//        aluno1.setCurso("ADS");
//        aluno1.setNota1(8.0);
//        aluno1.setNota2(7.6);
//        
//        System.out.println("RA: " + aluno1.getRa());
//        System.out.println("Nome: " + aluno1.getNome());
//        System.out.println("Curso: " + aluno1.getCurso());
//        System.out.println("Nota 1: " + aluno1.getNota1());
//        System.out.println("Nota 2: " + aluno1.getNota2());
//        System.out.println("Média: "+ aluno1.getMedia());
        
//        -- v3 - Usando o construtor para inserir valores direto na instância
//------------------------------------------------------------------------------
//
//        Aluno aluno2 = new Aluno("#124", "K Daniel", "CCO");
//
//        System.out.println("RA: " + aluno2.getRa());
//        System.out.println("Nome: " + aluno2.getNome());
//        System.out.println("Curso: " + aluno2.getCurso());
//        System.out.println("Nota 1: " + aluno2.getNota1());
//        System.out.println("Nota 2: " + aluno2.getNota2());
//        System.out.println("Média: "+ aluno2.getMedia());

          Aluno aluno3 = new Aluno("#9999999", "Samuel T", "CCO");
          
          aluno3.setNota1(10.0);
          aluno3.setNota2(8.0);
          
          System.out.println(aluno3);

    }    
}
