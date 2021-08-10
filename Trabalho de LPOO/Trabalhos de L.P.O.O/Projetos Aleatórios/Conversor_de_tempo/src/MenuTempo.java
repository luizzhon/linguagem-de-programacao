
import javax.swing.JOptionPane;


public class MenuTempo {
    
    int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Tempo t = new Tempo();
    
public void MenuTp(){    
    do{

    mens="Conversor de hora\n"
            + "\n1-Cadastrar a hora"
            + "\n2-Converter a hora para segundos"
            + "\n3-Converter a hora para minutos"
            + "\n4-Converter a hora para dias"
            + "\n0-Voltar";
    
            op=conver.ConvertInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            t.CadastrarHora(io, conver);
                    
        break;
                    
        case 2:
                    
            t.HrSg(io, conver);
                    
        break;
        
        case 3:
            
            t.HrMinutos(io, conver);
            
        break;
        
        case 4:
            
            t.HrDia(io, conver);
            
        break;
                
        case 0:
            
            JOptionPane.showMessageDialog(null, "Voltando...");
            
        break;
        
        default:
            
            JOptionPane.showMessageDialog(null, "Opção inválida, por favor Digite Novamente");
            
        break;
            }
    
    }while(op!=0);
    
}
}