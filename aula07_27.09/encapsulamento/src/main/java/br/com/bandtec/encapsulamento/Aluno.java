package br.com.bandtec.encapsulamento;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private Double nota1;
    private Double nota2;
    
    // Construtor;
    public Aluno(String ra, String nome, String curso){
    
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        
    }
    
    public String getRa(){
    
        return ra;
    
    }

    public String getNome() {

        return nome;

    }

    public String getCurso() {

        return curso;

    }

    public Double getNota1() {

        return nota1;

    }

    public Double getNota2() {

        return nota2;

    }

    public void setRa(String ra) {

        this.ra = ra;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public void setCurso(String curso) {

        this.curso = curso;

    }

    public void setNota1(Double nota1) {

        this.nota1 = nota1;

    }

    public void setNota2(Double nota2) {

        this.nota2 = nota2;

    }
    
    public Double getMedia(){
    
        return (nota1 + nota2)/2;
    
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
    
    
    
}
