package br.com.bandtec.projeto.metodos;

public class TesteUtilitaria {

    public static void main(String[] args) {
     
//      Agora estou criando um instância que está
//      referenciando a classe "Utilitaria",
//      Onde posso acessa-la atraves do objeto "ut"
        Utilitaria ut = new Utilitaria();
        
//      Estou chamando o objeto através do "ut" 
//      E dentro dela eu chamo o método "exibirLinha()";
        ut.exibirLinha();
        
        ut.exibirNome();

        ut.exibirLinha();

//      Chamando o método com o nome já decorando, em vez de fazer separado
//      Como feito acima.
        ut.nomeDecorado();

//      - Caso esteja usando os métodos com argumentos  
//      Descomente a linha 27 até a linha 35 e
//      comente a linha 14, 16, 18 e 22;
//      String x = "Daniel";
       
//      ut.exibirLinha();
        
//      ut.exibirNome(x);

//      ut.exibirLinha();

//      ut.nomeDecorado(x);
        
    }
}
