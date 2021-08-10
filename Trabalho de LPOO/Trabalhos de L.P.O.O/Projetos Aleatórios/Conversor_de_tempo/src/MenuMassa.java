
import javax.swing.JOptionPane;


public class MenuMassa {
    
           int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Massa m = new Massa();
    
public void MenuMss(){    
    do{

    mens="Conversor de Quilogramas\n"
            + "\n1-Cadastrar a quantidade de Quilogramas"
            + "\n2-Converter Quilogramas para Gramas"
            + "\n3-Converter Quilogramas para Toneladas"
            + "\n4-Converter Quilogramas para Onça"
            + "\n0-Voltar";
    
            op=conver.ConvertInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            m.CadastrarQuilograma(io, conver);
                    
        break;
                    
        case 2:
                    
            m.QgGm(io, conver);
                    
        break;
        
        case 3:
            
            m.QgTl(io, conver);
            
        break;
        
        case 4:
            
            m.QgOnca(io, conver);
            
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