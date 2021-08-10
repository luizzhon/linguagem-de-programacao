
import javax.swing.JOptionPane;


public class Menu {
    int op;
    String msg;
    Conversor conv = new Conversor();
    EntradaSaida io = new EntradaSaida();
    Roupas r = new Roupas();
    public void MenuInicial(){
        
        do{
            msg="Menu de Opções\n\n1-Cadastrar\n2-Exibir\n0-Sair";
            op=conv.ConverttoInt(io.EntradaDados(msg));
            switch (op){
                case 1:
                    msg="Digite o nome da Roupa: ";
                    String nm=io.EntradaDados(msg);
                    msg="Digite o tamanho da Roupa:";
                    int ta=conv.ConverttoInt(io.EntradaDados(msg));
                    msg="Digite o sexo: ";
                    String sx=io.EntradaDados(msg);
                    r.Cadastrar(nm, ta, sx);
                    break;
                case 2:
                    r.Exibir(io);
                    break;
            }
        }while(op!=0);
    }
    
}
