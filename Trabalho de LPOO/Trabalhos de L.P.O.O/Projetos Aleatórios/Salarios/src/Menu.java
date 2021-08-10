
import javax.swing.JOptionPane;


public class Menu {
    
    EntradaSaida io = new EntradaSaida();
    Conversor conv = new Conversor();
    Vendedor V = new Vendedor();
    Servidores S = new Servidores();
    Autonomos A = new Autonomos();
    public String msg;
    public int op;
    
    public void MenuInicial(){
        
        do{
            
            try{
    
    msg="Menu de opções\n"
    +"\n1-Cadastrar Vendedor"
    +"\n2-Calcular salário do vendedor"
    +"\n3-Exibir Vendedor"
    +"\n4-Cadastrar Servidor"
    +"\n5-Calcular salário do servidor"
    +"\n6-Exibir Servidor"
    +"\n7-Cadastrar autônomo"
    +"\n8-Calcular salário do autônomo"
    +"\n9-Exibir autônomo"
    +"\n0-Sair";
    
    op=conv.ConvertToInt(io.Entrada(msg));
    
    } catch (NumberFormatException e){
                 
       JOptionPane.showMessageDialog(null,"Digite apenas números\n\nErro: "+e);
       
      }
    
        switch(op){
        
            case 1:
                
                V.CadastrarValoresVen(io, conv);
                
            break;
            
            case 2:
                
                V.CalcularSalarioVen(io);
                
            break;
            
            case 3:
                
                V.ExibirSalarioVen(io);
                
            break;
            
            case 4:
                
                S.CadastrarValoresSer(io, conv);
                
            break;
            
            case 5:
                
                S.CalcularSalarioSer(io);
                                
            break;
            
            case 6:
                
                S.ExibirSalarioSer(io);
                
            break;
            
            case 7:
                
                A.CadastrarValoresAu(io, conv);
                
            break;
            
            case 8:
                
                A.CalcularSalarioAu(io);
                
            break;
            
            case 9:
                
                A.ExibirSalarioAu(io);
                
            break;
            
            case 0:
                
                msg="Saindo...";
                
                io.Saida(msg);
                
            break;
            
            default:
                
                msg="opção inválida...";
                
                io.Saida(msg);
                
            break;    
            
            }
        }while(op!=0);
    }
}
