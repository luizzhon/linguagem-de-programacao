
public class Moedas {
    
    private double CTDolar;
    private double CTEuro;
    public String msg;
    

    
    public double GetCTDolar(){
    
    return CTDolar;
    
    }
    
    public void SetCTDolar(double CTDolar){
    
    this.CTDolar = CTDolar;
        
    }
    
    public double GetCTEuro(){
    
    return CTEuro;
    
    }
    
    public void SetCTEuro(double CTEuro){
    
    this.CTEuro = CTEuro;
    
    }
    
    public void CadastrarTaxas(EntradaSaida io, Conversor conv){
    
    msg="Digite a taxa do Dólar";
    
    double TxDl=conv.ConvertDouble(io. EntradaDados(msg));
    this.SetCTDolar(TxDl);
        
    msg="Digite a taxa do Euro";
    
    double TxEr=conv.ConvertDouble(io.EntradaDados(msg));
    this.SetCTEuro(TxEr);
    
    }
    
    public void RealDolar(EntradaSaida io, Conversor conv){
    
    msg="Digite a quantidade em Real que deseja converter para dólar";
    
    double RaDl=conv.ConvertDouble(io.EntradaDados(msg));
    double Valor = RaDl/this.GetCTDolar();

    msg="O valor em Real é "+RaDl+" sendo que a cotação do dólar é "+this.GetCTDolar()+" O valor em dólar fica "+Valor;
    
    io.SaidaDados(msg);
    }
    
    public void RealEuro(EntradaSaida io, Conversor conv){
    
    msg="Digite a quantidade em Real que deseja converter para Euro";
    
    double RaEr=conv.ConvertDouble(io.EntradaDados(msg));
    double Valor = RaEr/this.GetCTEuro();
    
    msg="O valor em Real é "+RaEr+" Sendo que a cotação do Euro é "+this.GetCTEuro()+" O valor em Euro fica "+Valor;
    
    io.SaidaDados(msg);
    }
    
    public void DolarReal(EntradaSaida io, Conversor conv ){
    
    msg="Digite a quantidade em Dolar que deseja converter para Real";
    
    double DlRa=conv.ConvertDouble(io.EntradaDados(msg));
    double Valor = DlRa*this.GetCTDolar();
    
    msg="O valor em Dólar é "+DlRa+" Sendo que a cotação do Dólar é "+this.GetCTDolar()+" O valor em Real fica "+Valor;
    
    io.SaidaDados(msg);
    
    }
    
    public void EuroReal(EntradaSaida io, Conversor conv){
    
    msg="Digite a quantidade em Euro que deseja converter para Real";
    
    double ErRa=conv.ConvertDouble(io.EntradaDados(msg));
    double Valor = ErRa*this.GetCTEuro();
    
    msg="O valor em Euro é "+ErRa+" Sendo que a cotação do Euro é "+this.GetCTEuro()+" O valor em Real fica "+Valor;
    
    io.SaidaDados(msg);
    
    }
    
}
