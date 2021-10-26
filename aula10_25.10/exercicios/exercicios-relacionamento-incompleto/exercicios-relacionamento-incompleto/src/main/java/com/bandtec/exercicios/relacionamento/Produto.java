
package com.bandtec.exercicios.relacionamento;

/**
 *
 * @author diego brito
 */
public class Produto {

    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        
        StringBuilder str = new StringBuilder();
        
        str.append("-".repeat(10));
        str.append("PRODUTO");
        str.append("-".repeat(10));
        str.append("Nome: %s");
        str.append("Categoria: %s");
        str.append("Preço: R$%.2f");
        str.append("-".repeat(10));
        
        return String.format(
            str.toString(),
            this.nome,
            this.categoria,
            this.preco
        );
    }
}
