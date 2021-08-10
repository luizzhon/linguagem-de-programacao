
import javax.swing.JOptionPane;


public class Menu_Imobiliaria {
    

    
    EntradaSaida io = new EntradaSaida();
    Conversor conv = new Conversor();
    Venda vest = new Venda();
    Locação mob = new Locação();
    public String msg;
     public int op;
    
    public void  MenuInicial(){
            
    
        do{
            try{        
                
            msg="Menu De opções\n"
             +"\n1-Cadastar Venda "
             +"\n2-Exibir venda"
             +"\n3-Cadastrar locação"
             +"\n4-Exibir locação"
             +"\n0-Sair";
            
            op=conv.StringInt(io.EntradaDados(msg));
            
              } catch (NumberFormatException e){
                 
       JOptionPane.showMessageDialog(null,"Digite apenas números\n\nErro: "+e);
       
      }
            
            switch(op){
            
                case 1:
                    
                    vest.Cad_Vendat(io, conv);
                    
                break;
                
                case 2:
                    
                    vest.Exibir_Vendat(io);
                    
                break;
                
                case 3:
                    
                    mob.Cad_Loc(io, conv);
                    
                break;
                
                case 4:
                    
                    mob.Exibir_Loc(io);
                    
                break;
                
                case 0:
                
                    msg="Saindo...";
                    
                    io.SaidaDados(msg);
                
                break;
                
                default:
                    
                    msg="opção invalida";
                    
                    io.SaidaDados(msg);
                    
                break;
                
                
            }
            
        }while(op!=0);
    
    }
  
    }
    