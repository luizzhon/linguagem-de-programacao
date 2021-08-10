
import javax.swing.JOptionPane;


public class Comissoes {

    private double ValorComissao;
    private double TotVendas;
    private double VlTotal;
    private double SalBase;
    
public void CadastrarVendas(){

    double Tot=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total em vendas "));
    double Sal=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu salário base "));
    

    SetTotVendas ( Tot );
    SetSalBase ( Sal );
    
    }

public void CalcularComissao(){
    
    double ValorComi= this.GetTotVendas()*0.2;
    
    SetValorComissao( ValorComi );
    
    String mens="Seu Total de vendas é de: "+this.GetTotVendas()
    +"\nO valor da comissão é 20% sobre o total de vendas ficando assim: "+this.GetValorComissao();
    
    JOptionPane.showMessageDialog(null, mens);
    
}

public void CalcularTotal(){

    double VlTot = this.GetSalBase() + this.GetValorComissao();
    
    SetVlTotal( VlTot ); 
    
    String mens="Seu Salário total é o seu salário base ("+this.GetSalBase()+") Mais o valor da comissão ("+this.GetValorComissao()+") \nAssim totalizando: " +this.GetVlTotal();
    
    JOptionPane.showMessageDialog(null, mens);
    
}

public double GetValorComissao(){

return ValorComissao;

}

public void SetValorComissao( double ValorComissao ){

this.ValorComissao = ValorComissao;

}

public double GetTotVendas(){

return TotVendas;

}

public void SetTotVendas( double TotVendas ){

this.TotVendas = TotVendas;

}

public double GetVlTotal(){

return VlTotal;

}

public void SetVlTotal( double VlTotal ){

this.VlTotal = VlTotal;

}

public double GetSalBase(){

return SalBase;

}

public void SetSalBase( double SalBase ){

this.SalBase = SalBase;
    
}

    }

