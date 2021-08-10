import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        // Provocação do erro (--> indices)
      int[] valor = new int[10];
    
      // Adicionando no código acima o controle de excessão
      // vemos que o erro será capturado e não abortará o programa
      for (int i = 0; i <= 15; i++) {
        try {
           valor[i] = i;      
           System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("erro: " + e);
      }
      }
      
      // Para o tratamento de erros de entradas int/String:
    
      try{
        int a=Integer.parseInt(JOptionPane.showInputDialog("idade: "));
        System.out.println(a);
      } catch (NumberFormatException e){
       JOptionPane.showMessageDialog(null,"Apenas Numeros - erro: "+e);
      }
      
    // Para o controle de divisões
    //int i = 5571;
   // int b = i / 0;
   // System.out.println("O resultado  " + b);
    
    int i = 5571;
    int b=0;
    try{
        b = i / 0;
    } catch (ArithmeticException e){
        System.out.println("Problemas na divisão por 0 - erro: "+e);
    }
    System.out.println("O resultado  " + b);
    
       
    }}
    
    

