
public class Funcionario {
    
    private String nome;
    private int idade;
    private double salario;

    
    public Funcionario(){
        this("",0,0);
    }
    public Funcionario(String nm,int id, double sal){
        this.nome=nm;
        this.idade=id;
        this.salario=sal;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
