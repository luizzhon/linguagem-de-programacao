package br.com.bandtec.colaborador.recursos.humanos;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario){
    
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    
    }
    
    /**
     * @return the nome
     */
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador\n\n " + "nome: " + nome + "\ncargo: " + cargo + "\nsalario: " + salario + "\n\n";
    }
    
}
