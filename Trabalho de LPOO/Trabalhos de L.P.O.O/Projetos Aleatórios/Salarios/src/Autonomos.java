
public class Autonomos extends Funcionarios{
    
    public double N_Hrs;
    public double ValorHora;
    public String msg;
    public double Sal;
    
    public void CadastrarValoresAu(EntradaSaida io, Conversor conv){

        msg="Digite Seu Nome: ";
        
        this.Nome=io.Entrada(msg);
        
        msg="Digite seu número de registro: ";
        
        this.N_Registro=conv.ConvertToInt(io.Entrada(msg));
        
        msg="Digite o número de horas trabalhadas: ";
        
        this.N_Hrs=conv.ConvertToDouble(io.Entrada(msg));
        
        msg="Digite o valor da hora: ";
        
        this.ValorHora=conv.ConvertToDouble(io.Entrada(msg));
       
    }
    
    public void CalcularSalarioAu(EntradaSaida io){
        
        msg="Calculando..."
        +"O cálculo é feito através das horas trabalhadas x valor da hora";
        
        io.Saida(msg);
    
       Sal=this.N_Hrs*this.ValorHora;
       
    }
    
    public void ExibirSalarioAu(EntradaSaida io){
    
        msg="Nome do Autônomo: "+this.Nome
           +"\nNúmero de registro do Autônomo:"+this.N_Registro
           +"\nNúmero de horas trabalhadas: "+this.N_Hrs
           +"\nValor da hora: "+this.ValorHora
           +"\nSalário Do Autônomo:"+this.Sal;
               
        io.Saida(msg);
        
    }
    
}
