
import javax.swing.JOptionPane;


public class MenuComprimento {
       int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Comprimento c = new Comprimento();
    
public void MenuCp(){    
    do{

    mens="Conversor de Metros\n"
            + "\n1-Cadastrar a quantidade de Metros"
            + "\n2-Converter Metros para Centímetros"
            + "\n3-Converter Metros para Quilômetros"
            + "\n4-Converter Metros para Polegadas"
            + "\n0-Voltar";
    
            op=conver.ConvertInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            c.CadastrarMetro(io, conver);
                    
        break;
                    
        case 2:
                    
            c.MtCt(io, conver);
                    
        break;
        
        case 3:
            
            c.MtQM(io, conver);
            
        break;
        
        case 4:
            
            c.MtPole(io, conver);
            
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