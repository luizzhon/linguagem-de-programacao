
import java.util.ArrayList;


public class ListViagem {
    ArrayList<Viagem> vi = new ArrayList<Viagem>();
    
    public ListViagem(){
        
        vi.add(new Viagem("MG",2,6));
        vi.add(new Viagem("PB",10,15));
        vi.add(new Viagem("TC",8,15));
        
    }
    
    public String Listar(int ini, int fim){
        String msg=" ";
        for (Viagem elemento:vi){
            if(elemento.getDtInicioViag()>=ini){
                msg+="\n"+elemento.getDtInicioViag()+"-"+elemento.getDtFimViag()+"-"+elemento.getDestino();
            }
        } return msg;
    }
   
}
