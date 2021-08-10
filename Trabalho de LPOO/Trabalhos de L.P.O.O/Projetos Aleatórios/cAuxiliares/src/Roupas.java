
public class Roupas {
  
    private String nome;
    private int tamanho;
    private String sexo;

    public void Cadastrar(String nome,int tam, String sexo){
        this.setNome(nome);
        this.setTamanho(tam);
        this.setSexo(sexo);
    }
    
    public void Exibir(EntradaSaida io){
        String msg="Nome da Roupa: "+this.getNome()+
                "\nTamanho: "+this.getTamanho()+
                "\nSexo: "+this.getSexo();
        io.SaidaDados(msg);
    }
    
    
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
