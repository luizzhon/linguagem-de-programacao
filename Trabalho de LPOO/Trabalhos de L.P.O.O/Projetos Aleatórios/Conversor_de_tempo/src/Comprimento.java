public class Comprimento {
    
    private double Metro;
    public String msg;
    

    
    public double GetMetro(){
    
    return Metro;
    
    }
    
    public void SetMetro(double Metro){
    
    this.Metro = Metro;
        
    }
    
    public void CadastrarMetro(EntradaSaida io, Conversor conv){
    
    msg="Digite quantos metros você deseja converter";
    
    double metro=conv.ConvertDouble(io. EntradaDados(msg));
    this.SetMetro(metro);
        

    }
    
    public void MtCt(EntradaSaida io, Conversor conv){

    
    double Valor = this.GetMetro()*100;

    msg="\nA Quantidade de metros que você digitou é "+this.GetMetro()+" que equivale a "+Valor+" Centímetros"
    +"\n1 Metro equivale a 100 Centimetros";
    io.SaidaDados(msg);
    }
    
    public void MtQM(EntradaSaida io, Conversor conv){
    
    double Valor = this.GetMetro()/1000;
    
    msg="A quantidade de Metros que você digitou é "+this.GetMetro()+" que equivale a "+Valor+" Quilômetros"
            + "\n1 Metro equivale a 0,001 Quilômetros";
    
    io.SaidaDados(msg);
    }
    
    public void MtPole(EntradaSaida io, Conversor conv ){
        
    double Valor = this.GetMetro()*39.37;
    
    msg="A quantidade de metro que você digitou é "+this.GetMetro()+" que equivale a "+Valor+" Polegadas"
            + "\n1 Metro equivale a 39,37 Polegadas";
    
    io.SaidaDados(msg);
    
    }
    
}