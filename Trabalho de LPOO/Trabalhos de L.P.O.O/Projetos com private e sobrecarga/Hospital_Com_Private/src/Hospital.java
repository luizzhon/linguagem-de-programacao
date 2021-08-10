
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 525457252
 */
public class Hospital {
    
    public int Pacientes;
    public int Medicos;
    private int Enfermeiros;
    private String Endereco;
    
public void Cadastrar(){

    this.Pacientes=Integer.parseInt(JOptionPane.showInputDialog("Quantos pacientes tem no Hospital : "));
    this.Medicos=Integer.parseInt(JOptionPane.showInputDialog("Quantos Médicos tem no Hospital: "));
    int Enfer=Integer.parseInt(JOptionPane.showInputDialog("Quantos Enfermeiros/Enfermeiras tem no Hospital: "));
    String Ende=JOptionPane.showInputDialog("Qual o Endereço do Hospital: ");
    
    SetEnfermeiros(Enfer);
    SetEndereco(Ende);
    
}

public void Exibir(){

    String mens="Pacientes no Hospital: "+this.Pacientes
              + "\nMédicos no Hospital: "+this.Medicos
              + "\nEnfermeiros/Enfermeiras no Hospital: "+this.GetEnfermeiros()
              + "\nEndereço do Hospital: "+this.GetEndereco();
    
              JOptionPane.showMessageDialog(null, mens);
}

public int GetEnfermeiros(){

return Enfermeiros;

}

public void SetEnfermeiros( int Enfermeiros ){

this.Enfermeiros = Enfermeiros;

}

public String GetEndereco(){

return Endereco;

}

public void SetEndereco( String Endereco ){

this.Endereco = Endereco;

}



    
}


