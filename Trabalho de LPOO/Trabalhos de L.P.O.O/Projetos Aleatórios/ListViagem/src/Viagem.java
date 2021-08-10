
public class Viagem {
    
    private int dtInicio;
    private int dtFinal;
    private String Destino;
    
    public Viagem(){
    
        this(0, 0, "");
        
    }
    
    public Viagem(int dtInit, int dtFinal, String destino){
    
    this.dtInicio = dtInit;
    this.dtFinal = dtFinal;
    this.Destino = destino;
    
    }

    public int getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(int dtInicio) {
        this.dtInicio = dtInicio;
    }

    public int getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(int dtFinal) {
        this.dtFinal = dtFinal;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
}
