package br.com.bandtec.colaborador.recursos.humanos;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalSalariosAjust;

    public RecursosHumanos() {
        
        this.totalPromovidos = 0;
        this.totalSalariosAjust = 0;
    
    }
    
    public void reajustarSalario(Colaborador colaborador, Double reajuste){
        
        Double valorReajuste = (colaborador.getSalario() * reajuste)/100;
        
        colaborador.setSalario(colaborador.getSalario() + valorReajuste);
        totalSalariosAjust++;
        
    }
    
    public String promoveColaborador(Colaborador colaborador, String novoCargo, Double novoSalario){
    
        String operacaoIsValid;
        
        if(novoSalario > colaborador.getSalario()){
        
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
        
            operacaoIsValid = "Operação válida";
            
            totalPromovidos++;
        
        }else{
        
            operacaoIsValid = "Operação inválida";
            
        }
        
        return operacaoIsValid;
        
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalSalariosAjust() {
        return totalSalariosAjust;
    }
}
