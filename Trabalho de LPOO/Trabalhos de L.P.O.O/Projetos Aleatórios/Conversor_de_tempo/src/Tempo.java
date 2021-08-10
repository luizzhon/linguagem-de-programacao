
public class Tempo {
    
    private double Hora;
    public String msg;
    

    
    public double GetHora(){
    
    return Hora;
    
    }
    
    public void SetHora(double Hora){
    
    this.Hora = Hora;
        
    }
    
    public void CadastrarHora(EntradaSaida io, Conversor conv){
    
    msg="Digite a hora que o Senhor deseja converter";
    
    double hora=conv.ConvertDouble(io. EntradaDados(msg));
    this.SetHora(hora);
        

    }
    
    public void HrSg(EntradaSaida io, Conversor conv){

    
    double Valor = this.GetHora()*3600;

    msg="\nA hora que o Senhor digitou é "+this.GetHora()+" que equivale a "+Valor+" Segundos"
    +"\n1 Hora equivale a 3600 segundos";
    io.SaidaDados(msg);
    }
    
    public void HrMinutos(EntradaSaida io, Conversor conv){
    
    double Valor = this.GetHora()*60;
    
    msg="A hora que o Senhor digitou é "+this.GetHora()+" que equivale a "+Valor+" Minutos"
            + "\n1 Hora equivale a 60 minutos";
    
    io.SaidaDados(msg);
    }
    
    public void HrDia(EntradaSaida io, Conversor conv ){
        
    double Valor = this.GetHora()/24;
    
    msg="A hora que você digitou é "+this.GetHora()+" que equivale a "+Valor+" do dia"
            + "\n24 horas equivale a 1 dia";
    
    io.SaidaDados(msg);
    
    }
    

}


