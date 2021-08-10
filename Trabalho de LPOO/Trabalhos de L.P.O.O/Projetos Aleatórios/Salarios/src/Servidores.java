
public class Servidores extends Funcionarios {
    
    public double SalarioFixo;
    public int FaltasDia;
    public String msg;
    public double sal;
    
    public void CadastrarValoresSer(EntradaSaida io, Conversor conv){
    
        msg="Digite Seu Nome: ";
        
        this.Nome=io.Entrada(msg);
        
        msg="Digite seu número de registro: ";
        
        this.N_Registro=conv.ConvertToInt(io.Entrada(msg));
        
        msg="Digite seu Salário Fixo: ";
        
        this.SalarioFixo=conv.ConvertToDouble(io.Entrada(msg));
        
        msg="Digites quantas faltas você teve: ";
        
        this.FaltasDia=conv.ConvertToInt(io.Entrada(msg));
    
    }
    
    public void CalcularSalarioSer(EntradaSaida io){
        
        msg="Calculando..."
       +"\n\nO cálculo é feito através do seu salário fixo - os dias de falta";
        
        io.Saida(msg);
    
        sal=this.SalarioFixo-((this.SalarioFixo/30)*this.FaltasDia);
    
    }
    
    public void ExibirSalarioSer(EntradaSaida io){
    
        msg="Nome do Servidor: "+this.Nome
           +"\nNúmero de registro do Servidor:"+this.N_Registro
           +"\nSalário fixo: "+this.SalarioFixo     
           +"\nFaltas no mês: "+this.FaltasDia
           +"\nSalário final: "+this.sal;

           io.Saida(msg);
    }
    
}
