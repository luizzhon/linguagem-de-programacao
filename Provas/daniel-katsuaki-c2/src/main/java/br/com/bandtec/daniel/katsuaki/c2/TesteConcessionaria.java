package br.com.bandtec.daniel.katsuaki.c2;

public class TesteConcessionaria {

    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo(1, "Ferrari");
        Veiculo veiculo2 = new Veiculo(2, "Lamborghin");
        
        Concessionaria concessionaria = new Concessionaria("DanDan");
        
        System.out.println("\nInformações do carro 1:");
        System.out.println(veiculo1.toString());
        
        System.out.println("\nInformações do carro 2:");        
        System.out.println(veiculo2.toString());
        
        System.out.println();
        
        concessionaria.realizarVenda(veiculo1, 15000.0);
        
        System.out.println("\nCadastrando no estoque o carro 1:");
        concessionaria.cadastrarEstoque(veiculo1, 10);
        
        System.out.println("\nCadastrando no estoque o carro 2:");
        concessionaria.cadastrarEstoque(veiculo2, 20);
        
        System.out.println("\nRealizando venda do carro 1:");    
        concessionaria.realizarVenda(veiculo1, 15000.0);
        
        System.out.println("\nRealizando venda do carro 2:");
        concessionaria.realizarVenda(veiculo2, 10000.0, 50);
        
        System.out.println("\nInformações do carro 1:");
        System.out.println(veiculo1.toString());
        
        System.out.println("\nInformações do carro 2:");
        System.out.println(veiculo2.toString());
        
        System.out.println("\nInformações da concessionária: ");
        System.out.println(concessionaria.toString());
        
    }
    
}
