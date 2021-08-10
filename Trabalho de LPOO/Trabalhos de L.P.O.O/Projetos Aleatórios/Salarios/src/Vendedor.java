
public class Vendedor extends Funcionarios {
    
    public double vendas;
    public double porcentagem;
    public double fixo;
    public String msg;
    public double Sal;
    
    public void CadastrarValoresVen(EntradaSaida io, Conversor conv){
    
        msg="Digite Seu Nome: ";
        
        this.Nome=io.Entrada(msg);
        
        msg="Digite seu número de registro: ";
        
        this.N_Registro=conv.ConvertToInt(io.Entrada(msg));
        
        msg="Digite qual o seu valor em vendas: ";
        
        this.vendas=conv.ConvertToDouble(io.Entrada(msg));
        
        msg="Digite a porcentagem de vendas: ";
        
        this.porcentagem=conv.ConvertToDouble(io.Entrada(msg));
        
        msg="Digite seu salário fixo: ";
        
        this.fixo=conv.ConvertToDouble(io.Entrada(msg));
    
    }
    
    public void CalcularSalarioVen(EntradaSaida io){
        
        msg="Calculando..."
        +"\n\nO cálculo é feito através do seu salário fixo + porcentagem x valor das vendas";
        
        io.Saida(msg);
    
        Sal=this.fixo+((this.porcentagem/100)*this.vendas);
    
    }
    
    public void ExibirSalarioVen(EntradaSaida io){

        msg="Nome do vendedor: "+this.Nome
         +"\nNúmero de registro do vendedor "+this.N_Registro
         +"\nValor das vendas: "+this.vendas
         +"\nPorcentagem de vendas: "+this.porcentagem       
         +"\nSalário fixo: "+this.fixo
         +"\nSalário final: "+this.Sal; 
        
        io.Saida(msg);
                
    }
    
}

    


    
