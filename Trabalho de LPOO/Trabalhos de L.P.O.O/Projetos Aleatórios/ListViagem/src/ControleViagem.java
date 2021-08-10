
import javax.swing.JOptionPane;


public class ControleViagem {
    
    Calendario c = new Calendario();
    ListViagem lv = new ListViagem();
    
    public void VereficaCalendario(){
    
    
    JOptionPane.showMessageDialog(null, c.getCalendario());
    
    }
    
    public void VereficaViagem(int dtInicio, int dtFim){
    
        String dado = lv.Listar(dtInicio, dtFim);
        
       
        
    }
            
    
}
