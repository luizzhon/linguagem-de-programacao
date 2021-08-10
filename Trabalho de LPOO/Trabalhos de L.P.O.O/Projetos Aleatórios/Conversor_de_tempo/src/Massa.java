
public class Massa {
    
    private double Quilograma;
    public String msg;
    

    
    public double GetQuilograma(){
    
    return Quilograma;
    
    }
    
    public void SetQuilograma(double Quilograma){
    
    this.Quilograma = Quilograma;
        
    }
    
    public void CadastrarQuilograma(EntradaSaida io, Conversor conv){
    
    msg="Digite quantas Quilogramas você deseja converter";
    
    double quilo=conv.ConvertDouble(io. EntradaDados(msg));
    this.SetQuilograma(quilo);
        

    }
    
    public void QgGm(EntradaSaida io, Conversor conv){

    
    double Valor = this.GetQuilograma()*1000;

    msg="\nA Quantidade de Quilogramas que você digitou é "+this.GetQuilograma()+" que equivale a "+Valor+" Gramas"
    +"\n1 Quilograma equivale a 1000 Gramas";
    io.SaidaDados(msg);
    }
    
    public void QgTl(EntradaSaida io, Conversor conv){
    
    double Valor = this.GetQuilograma()/1000;
    
    msg="A quantidade de Quilogramas que você digitou é "+this.GetQuilograma()+" que equivale a "+Valor+" Toneladas"
            + "\n1 Quilograma equivale a 0,001 Toneladas";
    
    io.SaidaDados(msg);
    }
    
    public void QgOnca(EntradaSaida io, Conversor conv ){
        
    double Valor = this.GetQuilograma()*35.274;
    
    msg="A quantidade de Quilogramas que você digitou é "+this.GetQuilograma()+" que equivale a "+Valor+" Onça"
            + "\n1 Quilograma equivale a 35,274 Onça";
    
    io.SaidaDados(msg);
    
    }
    
    
}
