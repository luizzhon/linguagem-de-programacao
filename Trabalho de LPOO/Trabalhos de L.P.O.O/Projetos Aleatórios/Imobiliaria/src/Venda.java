
import javax.swing.JOptionPane;


public class Venda extends Imoveis {
    
    public double area_Construida;
    public String msg;
    
    
    public void Cad_Vendat(EntradaSaida io, Conversor conv){
        
        try{
        
        msg="Digite a área total:";
        
        this.Area_Total=conv.StringDouble(io.EntradaDados(msg));
        
        msg="Digite a área construida: ";

        this.area_Construida=conv.StringDouble(io.EntradaDados(msg));
        
        msg="Digite o valor da venda: ";
        
        double Valor=conv.StringDouble(io.EntradaDados(msg));
        
        this.SetValor(Valor);
        
        msg="Qual o nome do bairro: ";
                
        this.Bairro=io.EntradaDados(msg);
        
        } catch (NumberFormatException e){
                 
       JOptionPane.showMessageDialog(null,"Digite apenas números\n\nErro: "+e);
       
      }
        
    }
    
    public void Exibir_Vendat(EntradaSaida io){
    
        msg="Vendas\n"
         +"\nÁrea Total: "+this.Area_Total
         +"\nÁrea construida: "+this.area_Construida
         +"\nValor da Venda: "+this.GetValor()
         +"\nNome do bairro: "+this.Bairro;
    
    }
    
}
