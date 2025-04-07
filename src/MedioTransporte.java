//clase generalizada
public class MedioTransporte extends Transporte{
    public String nombre;
    public String medio;

    @Override
    public void trasladar(float latitud, float longitud) {
        System.out.println("Trasladando medio transporte: " + latitud + " " + longitud);
    }
}
