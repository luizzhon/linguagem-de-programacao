
public class Funcionarios {
    
    private String Nome;
    private double Salario;
    private String Setor;
    private int Idade;
    
public void Cadastrar (String Nome,double Sal, String Set, int Id ){

    this.SetNome(Nome);
    this.SetSalario(Sal);
    this.SetSetor(Set);
    this.SetIdade(Id);
    
}

public void Exibir (EntradaSaida io){

    String mens="Dados do Funcionário "+this.GetNome()+
                "\n\nNome do Funcionário: "+this.GetNome()+
                "\nSalário do Funcionário: "+this.GetSalario()+
                "\nSetor do Funcionário: "+this.GetSetor()+
                "\nIdade do Funcionário: "+this.GetIdade();

                io.SaidaDados(mens);
}

public String GetNome(){

return Nome;
    
}

public void SetNome(String Nome){

this.Nome=Nome;

}

public double GetSalario(){

return Salario;

}

public void SetSalario(double Salario){

this.Salario = Salario;

}

public String GetSetor(){

return Setor;

}

public void SetSetor(String Setor){

this.Setor = Setor;

}

public int GetIdade(){

return Idade;

}

public void SetIdade(int Idade){

this.Idade = Idade;

}
}
