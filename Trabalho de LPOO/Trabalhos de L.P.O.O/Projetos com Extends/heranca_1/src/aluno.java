/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo.ferreira
 */
public class aluno extends pessoas{
    
    public String curso;
    public String turma;
    String msg;
    
    public void Cad_Aluno(EntradaSaida io,Conversor c){
        msg="Nome: ";
        this.nome=io.EntradaDados(msg);
        msg="Curso: ";
        this.curso=io.EntradaDados(msg);
        msg="Turma: ";
        this.turma=io.EntradaDados(msg);
        msg="Numero de Registro: ";
        try{
          this.reg=c.StringToInt(io.EntradaDados(msg));
        }
        catch(NumberFormatException e){
            msg="Somente Numeros";
            io.SaidaDados(msg);
        }
    }
    public void Exibe_Aluno(EntradaSaida io){
        msg="Aluno: "+this.nome+
                "\nCurso: "+this.curso+
                "\nTurma: "+this.turma+
                "\nNumero de Registro: "+this.reg;
        io.SaidaDados(msg);
    }
    
}
