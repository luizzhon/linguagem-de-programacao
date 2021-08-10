
import javax.swing.JOptionPane;


public class Controle_Pacote {
    
    Pacote p = new Pacote();
    
    public double Calcular_Pacote(String dest, int nd, int np, String CateHotel){
    
        double valor=0;
        
        if(dest.equals("Porto de Galinhas")&& CateHotel.equals("3 Estrelas")){
        
            valor = (200*nd)*np;
            
        }
        if(dest.equals("Porto de Galinhas")&& CateHotel.equals("4 Estrelas")){
        
            valor = (300*nd)*np;
            
        }
        if(dest.equals("Fortaleza")&& CateHotel.equals("3 Estrelas")){
        
            valor = (400*nd)*np;
            
        }
        if(dest.equals("Fortaleza")&& CateHotel.equals("4 Estrelas")){
        
            valor = (500*nd)*np;
            
        }
        if(dest.equals("João Pessoa")&& CateHotel.equals("3 Estrelas")){
        
            valor = (500*nd)*np;
           
        }
        if(dest.equals("João Pessoa")&& CateHotel.equals("4 Estrelas")){
        
            valor = (700*nd)*np;
   
        }
        return valor;
        
    }
    
    public void Confirmar(String dest, int nd, int np, String CateHotel, double Val_Pacote){
        
        p.setDestino(dest);
        p.setCategoria_Hotel(CateHotel);
        p.setN_Dias(nd);
        p.setN_Pessoas(np);
        p.setValor_Pacote(Val_Pacote);
        
        JOptionPane.showMessageDialog(null, "Pacote Confirmado");
        
    }
    
    public void Cancelar(){
    
        JOptionPane.showMessageDialog(null, "Pacote Cancelado");
    
    }
    
}
