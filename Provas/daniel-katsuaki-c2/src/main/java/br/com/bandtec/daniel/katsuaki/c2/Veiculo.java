package br.com.bandtec.daniel.katsuaki.c2;

public class Veiculo {

    private Integer id;
    private String modelo;
    private Integer quatidadeEstoque;
    private Double valorVenda;
    
    public Veiculo(Integer id, String modelo){
    
        this.id = id;
        this.modelo = modelo;
        this.quatidadeEstoque = 0;
        this.valorVenda = 0.0;
        
    }
    
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the quatidadeEstoque
     */
    public Integer getQuatidadeEstoque() {
        return quatidadeEstoque;
    }

    /**
     * @param quatidadeEstoque the quatidadeEstoque to set
     */
    public void setQuatidadeEstoque(Integer quatidadeEstoque) {
        this.quatidadeEstoque = quatidadeEstoque;
    }

    /**
     * @return the valorVenda
     */
    public Double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
 
    @Override
    public String toString() {
        return "ID: "+ id + "\nModelo: " + modelo + "\nQuantidade Estoque: " 
                + quatidadeEstoque + "\nValor Tabela: " + valorVenda;
    }
    
}
