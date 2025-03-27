public class Automovil extends MedioTransporte {
    public int cantidadRuedas;
    public String color;

    public void tocarBocina() {
        System.out.println("Estoy tocando bocina...");
    }

    public void trasladar(float latitud, float longitud) {
        super.trasladar(latitud, longitud);
        System.out.println("Estoy trasladandome en automovil...");
    }
}
