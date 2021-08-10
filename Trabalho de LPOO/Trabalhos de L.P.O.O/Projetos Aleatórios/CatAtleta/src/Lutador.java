public class Lutador extends TesteEsportista{
    public double peso;

    public Lutador(double p) {
        super(p);
    }
    public String DefinirCategoria(){
        String cat;
        if(this.getPeso()<=54){
            cat="Pluma";
        }
        else{
            if(this.getPeso()<=60){
                cat="Leve";
            }
            else{
                if(this.getPeso()<=75){
                    cat="Meio Leve";
                }
                else{
                    cat="Pesado";
                }
            }
        }
        return cat;
    }
}