
import javax.swing.JOptionPane;

public class Menu {
    
    int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Moedas m = new Moedas();
    
    public void MenuInicial(){
    do{

    mens="Menu de Opções\n"
            + "\n1-Cadastrar Taxas"
            + "\n2-Converter Real para Dólar"
            + "\n3-Converter Real para Euro"
            + "\n4-Converter Dólar para Real"
            + "\n5-Converter Euro para Real"
            + "\n0-Sair";
    
            op=conver.ConvertInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            m.CadastrarTaxas(io, conver);
                    
        break;
                    
        case 2:
                    
            m.RealDolar(io, conver);
                    
        break;
        
        case 3:
            
            m.RealEuro(io, conver);
            
        break;
        
        case 4:
            
            m.DolarReal(io, conver);
            
        break;
        
        case 5:
            
            m.EuroReal(io, conver);
            
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
