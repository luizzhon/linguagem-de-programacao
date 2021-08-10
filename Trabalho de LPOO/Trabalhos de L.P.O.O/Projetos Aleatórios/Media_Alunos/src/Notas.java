
import javax.swing.JOptionPane;


public class Notas {
    
    private double n1;
    private double n2;
    private double media;
    
    public void CadastrarNotas(){
    
    double nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1° Nota: "));
    double nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2° Nota: "));
    
    
    SetNotaUm(nota1);
    SetNotaDois(nota2);
   
    
    }
        public double GetNotaUm(){
    
    return n1;
    
    }
    
    public void SetNotaUm(double n1){   
        
       this.n1 = n1;
        
    }
    
    public double GetNotaDois(){
    
    return n2;
    
    }
    
    public void SetNotaDois(double n2){
    
    this.n2 = n2;
        
    }
    
    public double GetMedia(){
        
    return media;
        
    }
    
    public void SetMedia(double media){
    
    this.media = media;
    
    
    }
    
    public void CalcularMedia(){
    
        double med = ( this.GetNotaUm()+this.GetNotaDois() ) /2 ;
        
         SetMedia(med);
    
    String mens="1° Nota: "+this.GetNotaUm()+
              "\n2° Nota: "+this.GetNotaDois()+
              "\nMédia: "+this.GetMedia();
    
              JOptionPane.showMessageDialog(null, mens);
    
    }
    
    public void VerificarSituacao(){

        if (this.GetMedia()<=4){
        
            JOptionPane.showMessageDialog(null, "Aluno Reprovado");
        
        }
        else{
        
            if (this.GetMedia()<=10){
            
            JOptionPane.showMessageDialog(null, "Aluno Aprovado");
            
            }
            else{
            
                JOptionPane.showMessageDialog(null, "Situação não existente, por favor, redigite suas notas \n\nObservação: Digite sua nota de 0 a 10");
            
            }
        }

    }
    


}
