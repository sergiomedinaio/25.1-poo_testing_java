//clase generalizada
public class MedioTransporte extends Transporte{
    private String nombre;
    private String medio;

    @Override
    public void trasladar(float latitud, float longitud) {
        System.out.println("Trasladando medio transporte: " + latitud + " " + longitud);
    }
}
