import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Persona p1= new Persona("Juan","Perez",43081633,22);
        Persona p2= new Persona("Jose","Garcia",23342553,52);

        Contratos c1= new ContratoMensual(p1,12,new Date(2022,8,31,12,35),true,10000.50,36,"jefe");
        Contratos c2= new ContratoMensual(p2,12,new Date(2022,6,23),false,5000.20,36,"supervisor");
        Contratos c3= new ContratoPorHoras(p1,6,new Date(2022,12,31),true,16,600.50);
        Contratos c4= new ContratoPorHoras(p2,10,new Date(2022,10,7),true,32,350.50);



        //PRUEBO METODOS SOBRE c1

        System.out.println(c1.puedeIncorporarse());
        System.out.println(c1.getFechaInicio().getMonth());
        System.out.println(((ContratoMensual)c1).esJefe());

        //PRUEBO METODOS SOBRE c2

        System.out.println("-----------------------------------");

        System.out.println(c2.puedeIncorporarse());
        System.out.println(c2.getFechaInicio().getMonth());
        System.out.println(((ContratoMensual)c2).esJefe());

        //PRUEBO METODOS SOBRE c3

        System.out.println("-----------------------------------");

        System.out.println(c3.puedeIncorporarse());
        System.out.println(c3.getFechaInicio().getDate());
        System.out.println(((ContratoPorHoras)c3).compareTo(c4));

        if (((ContratoPorHoras)c3).getCantHoras()>((ContratoPorHoras)c3).getCantHoras()){
            System.out.println("El contrato 3 es por mas horas que el contrato 4");
        }else if (((ContratoPorHoras)c3).getCantHoras()>((ContratoPorHoras)c3).getCantHoras()){
            System.out.println("Los contratos son por la misma cantidad de horas");
        }else{
            System.out.println("El contrato 4 es por mas horas que el contrato 3");
        }
    }


}
