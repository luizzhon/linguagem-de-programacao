
import javax.swing.JOptionPane;


public class Menu {
    
    int op;
    String mens;
    Conversor conver = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Funcionarios f = new Funcionarios();
    
    public void MenuInicial(){
    do{

    mens="Menu de Opções\n\n1-Cadastrar\n2-Exibir\n0-Sair";
    
            op=conver.ConverttoInt(io.EntradaDados(mens));
            
    switch (op){
        
        case 1:
                    
            mens="Digite seu Nome: ";
                    
            String Nm=io.EntradaDados(mens);
                    
            mens="Digite seu Salário:";
                    
            int Sal=conver.ConverttoInt(io.EntradaDados(mens));
                    
            mens="Digite seu Setor: ";
                    
            String Set=io.EntradaDados(mens);
                    
            mens="Digite sua Idade:";
                    
            int Id=conver.ConverttoInt(io.EntradaDados(mens));
                    
            f.Cadastrar(Nm, Sal, Set, Id);
                    
        break;
                    
        case 2:
                    
            f.Exibir(io);
                    
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
