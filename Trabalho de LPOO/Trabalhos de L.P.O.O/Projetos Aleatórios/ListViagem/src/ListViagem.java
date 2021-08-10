
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListViagem {
    
    ArrayList<Viagem> vi = new ArrayList<Viagem>();
    
    public ListViagem(){
    
        vi.add(new Viagem(10, 20, "MG"));
        vi.add(new Viagem(5, 25, "SC"));
        vi.add(new Viagem(2, 30, "SP"));

        
    }
    
    public String Listar(int ini, int fim){
    
        String msg = "";
        
        for (Viagem elemento: vi){
            
            if(elemento.getDtInicio()>=ini){
                msg+="\n"+elemento.getDtInicio()+"-"+elemento.getDtFinal()+"-"+elemento.getDestino();
            }
        }JOptionPane.showMessageDialog(null, msg); 
        return msg;
        
    }
}
