
import javax.swing.JOptionPane;

public class Menu {
    
    int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    MenuTempo MT = new MenuTempo();
    MenuComprimento MC = new MenuComprimento();
    MenuMassa MM = new MenuMassa();
    
    public void MenuInicial(){
    do{

    mens="Menu de Opções\n"
            + "\n1-Conversor de Tempo"
            + "\n2-Conversor de Comprimento"
            + "\n3-Conversor de Massa"
            + "\n0-Sair";
    
            op=conver.ConvertInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            MT.MenuTp();
                    
        break;
                    
        case 2:
                    
            MC.MenuCp();
                    
        break;
        
        case 3:
            
            MM.MenuMss();
            
        break;
                       
        case 0:
            
            JOptionPane.showMessageDialog(null, "Saindo...");
            
        break;
        
        default:
            
            JOptionPane.showMessageDialog(null, "Opção inválida, por favor Digite Novamente");
            
        break;
            }
    
    }while(op!=0);
    
    }
}
