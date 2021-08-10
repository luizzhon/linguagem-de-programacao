
import javax.swing.JOptionPane;


public class Atleta extends TesteEsportista{
    public double peso;

    public Atleta(double p) {
        super(p);
    }
    
    public String DefinirCategoria(){
        String cat;
        if(this.getPeso()<=50){
            cat="Infantil";
        }
        else{
            if(this.getPeso()<=65){
                cat="Juvenil";
            }
            else{
                cat="Adulto";
            }
        }        
        return cat;
    }
    
  
    
}
