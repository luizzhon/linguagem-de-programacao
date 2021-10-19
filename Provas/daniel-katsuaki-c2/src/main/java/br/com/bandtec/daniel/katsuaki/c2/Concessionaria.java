package br.com.bandtec.daniel.katsuaki.c2;

public class Concessionaria {

    private String nome;
    private Integer quantidadeVeiculosVendidos;
    private Integer quantidadeDescontosAplicados;
    
    public Concessionaria(String nome){
    
    this.nome = nome;
    this.quantidadeDescontosAplicados = 0;
    this.quantidadeVeiculosVendidos = 0;
    
    }
    
    public void realizarVenda(Veiculo veiculo, Double valorVenda){
        
        if(veiculo.getQuatidadeEstoque() >= 1){
            
            veiculo.setValorVenda(valorVenda);
        
            System.out.println("Realizando a venda sem desconto: "
                 +"\n" + veiculo.toString());
            
            quantidadeVeiculosVendidos++;
//Faltou adicionar: veiculo.setQuatidadeEstoque(veiculo.getQuatidadeEstoque() - 1);
            
        }else{
        
              System.out.println("Operação inválida");
        
        }
        
    }
    
    public void realizarVenda(Veiculo veiculo, Double valorVenda, Integer valorBonus){
    
        
//Faltou adicionar: if(veiculo.getQuatidadeEstoque() >= 1){   

        Double valorDesconto = (valorVenda * valorBonus)/100;
        Double valorVendaFinal = valorVenda - valorDesconto;
        
        veiculo.setValorVenda(valorVenda);
// Correto: veiculo.setValorVenda(valorVendaFinal);

        System.out.println(String.format("Realizando a venda com desconto: \n%s"
                                        +"\n\n-----------------"
                                        +"\nValor venda: %.2f"
                                        +"\nValor Desconto: %d%% -> R$%.2f"
                                        +"\n-----------------"
                                        +"\nValor Final %.2f", 
                                        veiculo.toString(), valorVenda,
                                        valorBonus, valorDesconto, valorVendaFinal));
    
        quantidadeDescontosAplicados++;
//Faltou adicionar: quantidadeVeiculosVendidos++;
//Faltou adicionar: veiculo.setQuatidadeEstoque(veiculo.getQuatidadeEstoque() - 1);
//Faltou adicionar: }
    }
    
    public void cadastrarEstoque(Veiculo veiculo, Integer qtdCadastro){
    
        System.out.println("O estoque do carro "+ veiculo.getModelo() +
                " foi alterado");
    
        veiculo.setQuatidadeEstoque( veiculo.getQuatidadeEstoque() + qtdCadastro);
    }
    
     @Override
    public String toString() {
        return "Concessionária: "+ nome 
             + "\nQuantidade de vendas: " + quantidadeVeiculosVendidos 
             + "\nDescontos aplicados: " + quantidadeDescontosAplicados;
    }   
    
}
