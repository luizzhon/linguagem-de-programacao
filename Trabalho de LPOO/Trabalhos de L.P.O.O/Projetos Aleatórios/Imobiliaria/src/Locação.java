
import javax.swing.JOptionPane;


public class Locação extends Imoveis {
    
    public String Nome_Fiador;
    public String msg;
    public void Cad_Loc(EntradaSaida io, Conversor conv){
        
         try{    
    
        msg="Qual o nome do fiador: ";
        
        this.Nome_Fiador=io.EntradaDados(msg);
        
         msg="Digite a área construida: ";

        this.Area_Total=conv.StringDouble(io.EntradaDados(msg));
        
        msg="Digite o valor da locação: ";
        
        double Valor=conv.StringDouble(io.EntradaDados(msg));
        
        this.SetValor(Valor);
        
        msg="Qual o nome do bairro: ";
                
        this.Bairro=io.EntradaDados(msg);
        
        } catch (NumberFormatException e){
                 
       JOptionPane.showMessageDialog(null,"Digite apenas números\n\nErro: "+e);
       
      }
    
    }
    
    public void Exibir_Loc(EntradaSaida io){
    
        msg="Locação\n"
         +"\nNome do fiador: "+this.Nome_Fiador
         +"\nÁrea Total: "+this.Area_Total
         +"\nValor da locação: "+this.GetValor()
         +"\nNome do bairro: "+this.Bairro;
        
        io.SaidaDados(msg);
        
    }
    
}
