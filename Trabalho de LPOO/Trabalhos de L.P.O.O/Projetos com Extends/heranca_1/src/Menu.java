/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardo.ferreira
 */
public class Menu {
    
    int op;
    String msg;
    
    
    public void MenuInicial(){
        
        EntradaSaida io = new EntradaSaida();
        Conversor c = new Conversor();
        aluno a = new aluno();
        professor p = new professor();
        
        do{
          try{
            msg="1-Cadastrar Professor\n2-Cadastrar Aluno\n3-Exibir Professor\n4-Exibir Aluno\n0-Sair";
            op=c.StringToInt(io.EntradaDados(msg));
            switch (op){
                case 1:
                    p.Cad_Professor(io,c);
                    break;
                case 2:
                    a.Cad_Aluno(io, c);
                    break;
                case 3:
                    p.Exibe_Professor(io);
                    break;
                case 4:
                    a.Exibe_Aluno(io);
                    break;
                case 0:
                    msg="Saindo....";
                    io.SaidaDados(msg);
                    break;
                default:
                    msg="Opcao invalida....";
                    io.SaidaDados(msg);
                    break;
            }
          }
            catch (NumberFormatException e){
                msg="Apenas numeros";
                io.SaidaDados(msg);
                op=1;
            }
        }while(op!=0);
    }
}
