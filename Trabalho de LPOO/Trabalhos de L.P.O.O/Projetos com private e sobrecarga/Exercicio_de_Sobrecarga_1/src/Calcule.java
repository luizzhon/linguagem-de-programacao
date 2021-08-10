
import javax.swing.JOptionPane;


public class Calcule {
    
    public int Maior;
    
    public void Maior(int n1,int n2){
        
        if(n1>n2){
        
            Maior=n1;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+" e "+n2+" é: "+Maior);
        
        }
        if(n1==n2){
        
            JOptionPane.showMessageDialog(null, "Os números "+n1+" e "+n2+" são iguais");
        
        }
        else{
        
        Maior=n2;
        
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+" e "+n2+" é: "+Maior);
        
        }
    
    }
    
    public void Maior(int n1, int n2, int n3){
    
        if(n1>n2 & n1>n3){
        
            Maior=n1;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+" e "+n3+" é: "+Maior);
        
        }else{
        
        if(n2>n1 & n2>n3){
            
            Maior=n2;
            
            JOptionPane.showMessageDialog(null , "O maior número entre "+n1+", "+n2+" e "+n3+" é: "+Maior);
        
        }else{
        
        if(n3>n1 & n3>n2){
        
            Maior=n3;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+" e "+n3+" é: "+Maior);

        }
        else{
        
            JOptionPane.showMessageDialog(null, "Os número "+n1+", "+n2+" e "+n3+" são iguais");

        
                }  
            }
        }
    }
    
    public void Maior(int n1, int n2, int n3, int n4){
        
        if(n1>n2 & n1>n3 & n1>n4){
        
            Maior=n1;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+", "+n3+" e "+n4+" é: "+Maior);
        
        }else{
            if(n2>n1 & n2>n3 & n2>n4){
            
            Maior=n2;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+", "+n3+" e "+n4+" é: "+Maior);
 
            }else{
            
            if(n3>n1 & n3>n2 & n3>n4){
                
            Maior=n3;
            
            JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+", "+n4+" e "+n3+" é: "+Maior);

            }else{
                
                if(n4>n1 & n4>n2 & n4>n3 ){
                
                    Maior=n4;
                    
                    JOptionPane.showMessageDialog(null, "O maior número entre "+n1+", "+n2+", "+n3+" e "+n4+"é: "+Maior);

                    }else{
                    
                    JOptionPane.showMessageDialog(null, "Os número "+n1+", "+n2+", "+n3+" e "+n4+" São iguais");

                    
                    }
                }
            }
        }
    }
}
