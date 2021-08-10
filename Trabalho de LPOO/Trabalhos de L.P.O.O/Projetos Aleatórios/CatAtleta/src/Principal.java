
import javax.swing.JOptionPane;


public class Principal {
    
   
    public static void main(String[] args) {
        double peso=0;
        String cat;
        int n,n_esportistas, t = 0;
        n_esportistas=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de esportistas: "));
        for(n=1;n<=n_esportistas;n++){
            t=Integer.parseInt(JOptionPane.showInputDialog("Categoria do"+n+ "Esportistas \n1-Lutador"+ "\n2-Atleta"));
            peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso;"));
        }
        if(t==1){
            TesteEsportista l=new Lutador(peso);
            cat = l.DefinirCategoria();
            JOptionPane.showMessageDialog(null, "atleta, categoria: "+cat);
        }
        else{
            TesteEsportista A=new Atleta(peso);
            cat = A.DefinirCategoria();
            JOptionPane.showMessageDialog(null,"Atleta, categoria: "+cat);
        }
    }
    
}
