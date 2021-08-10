

public class Calendario {
    private String Calendario;
    
        public Calendario(){
            this(" 1 - 2 - 3 - 4 - 5 - \n6 - 7 - 8 - 9 - 10");
                   
        }
        public Calendario(String data){
            this.Calendario=data;
        }
    public String getCalendario() {
        return Calendario;
    }

    
    public void setCalendario(String Calendario) {
        this.Calendario = Calendario;
    }
    
}
