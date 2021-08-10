
public class Viagem {
    private String Destino;
    private int dtInicioViag;
    private int dtFimViag;
    
    public Viagem(){
        this("",0,0);
    }
    public Viagem(String de, int di, int df){
        this.Destino=de;
        this.dtInicioViag=di;
        this.dtFimViag=df;
    }
    
    public String getDestino() {
        return Destino;
    }

   
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    
    public int getDtInicioViag() {
        return dtInicioViag;
    }

    
    public void setDtInicioViag(int dtInicioViag) {
        this.dtInicioViag = dtInicioViag;
    }

   
    public int getDtFimViag() {
        return dtFimViag;
    }

   
    public void setDtFimViag(int dtFimViag) {
        this.dtFimViag = dtFimViag;
    }
    
    
}
