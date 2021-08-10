
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo.ferreira
 */
public class professor extends pessoas{
    
    public String especialidade;
    public int n_aulas;
    String msg;
    public void Cad_Professor(EntradaSaida io,Conversor c){
        msg="Qual Especialidade: ";
        this.especialidade=io.EntradaDados(msg);
        msg="Numero de aulas: ";
        try{
           this.n_aulas=c.StringToInt(io.EntradaDados(msg));
        }
        catch (NumberFormatException e){
            msg="Somente Numeros: ";
            io.SaidaDados(msg);
        }
        msg="Nome: ";
        this.nome=io.EntradaDados(msg);
        msg="Numero de Registro: ";
        try {
          this.reg=c.StringToInt(io.EntradaDados(msg));
        }
        catch (NumberFormatException e){
            msg="Somente Numeros: ";
            io.SaidaDados(msg);
        }
        
    }
    public void Exibe_Professor(EntradaSaida io){
        msg="Professor: "+this.nome+
                "\nEspecialidade: "+this.especialidade+
                "\nNumero de Aulas: "+this.n_aulas+
                "\nNumero de Registro: "+this.reg;
        io.SaidaDados(msg);
    }
    
    
}
