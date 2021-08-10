
import javax.swing.JOptionPane;


public class ControleViagem {

    Calendario cv = new Calendario();
    ListViagem lv = new ListViagem();
    
    public void VerificaCalendario(){
        String msg = cv.getCalendario();
        JOptionPane.showMessageDialog(null,msg);
    }
    public void VerificaViagem(int di, int df ){
        String Dado = lv.Listar(di, df);
        JOptionPane.showMessageDialog(null, Dado);
    }
        
}

