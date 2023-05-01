import java.util.Date;

public abstract class Contratos {

    protected Persona persona;
    protected int cantMeses;
    protected Date fechaInicio;
    protected Boolean sello;

    public Contratos(Persona persona, int cantMeses, Date fechaInicio, Boolean sello) {
        this.persona = persona;
        this.cantMeses = cantMeses;
        this.fechaInicio = fechaInicio;
        this.sello = sello;
    }

    public boolean puedeIncorporarse(){
        boolean respuesta;
        if (this.sello == true){
            respuesta= true;
        }else {
            respuesta= false;
        }
        return respuesta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Boolean getSello() {
        return sello;
    }

    public void setSello(Boolean sello) {
        this.sello = sello;
    }
}
