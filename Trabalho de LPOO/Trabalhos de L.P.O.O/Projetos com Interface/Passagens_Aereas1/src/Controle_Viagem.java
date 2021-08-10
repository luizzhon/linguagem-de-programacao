
import javax.swing.JOptionPane;


public class Controle_Viagem {
    
    Voo v = new Voo();
    
    public double Calcular_passa(String dest, double np){
    
       
        
        if(dest.equals("MG")){
        
            double valor_Passa=np*300;
                
            return valor_Passa;
        }else{
        
            if(dest.equals("RJ")){
            
                double valor_Passa=np*250;
                
                return valor_Passa;
                
            }else{
            
                double valor_Passa=np*450;
                
                return valor_Passa;
            
            }
        
        }
    
    }
    
    public double Calcular_Baga(double peso){
    
        
        
        if(peso==5){
        
            return 0;
        
        }else{
        
            double Valor_Carga = peso-5;
            
            return Valor_Carga;
        
        }
        }
    
    public void Confirmar_Viagem(String dest, double np, double peso, double ValorTot){
    
        v.setDestino(dest);
        v.setN_Passa(np);
        v.setPeso_Baga(peso);
        v.setValor_Total(ValorTot);
    
        JOptionPane.showMessageDialog(null, "Viagem Agendada");
    }
    
    public void Cancelar_Viagem(){
    
    JOptionPane.showMessageDialog(null, "Viagem Cancelada");
    
    }
        
    
    
    
}
