import java.util.Date;

public class ContratoMensual extends Contratos{

    private Double salarioMensual;
    private int horasTotales;
    private String cargo;


    public ContratoMensual(Persona persona, int cantMeses, Date fechaInicio, Boolean sello, Double salarioMensual, int horasTotales, String cargo) {
        super(persona, cantMeses, fechaInicio, sello);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public boolean esJefe(){
        boolean respuesta;
        if (this.cargo.equals("jefe")){
            respuesta= true;
        } else {
            respuesta=false;
        }
        return respuesta;
    }



}
