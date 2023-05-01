import java.util.Date;

public class ContratoPorHoras extends Contratos implements Comparable {

    private int cantHoras;
    private Double valorHora;

    public ContratoPorHoras(Persona persona, int cantMeses, Date fechaInicio, Boolean sello, int cantHoras, Double valorHora) {
        super(persona, cantMeses, fechaInicio, sello);
        this.cantHoras = cantHoras;
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
        ContratoPorHoras cph2 = (ContratoPorHoras) o;
        int respuesta;
        if (this.getCantHoras()>cph2.getCantHoras()){
            respuesta=1;
        } else if (this.getCantHoras()== cph2.getCantHoras()) {
            respuesta= 0;
        }else {
            respuesta= -1;
        }
        return respuesta;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
