public class Automovil extends MedioTransporte {
    public int cantidadRuedas;
    public String color;

    public void tocarBocina() {
        System.out.println("Estoy tocando bocina...");
    }

    public void trasladar(float latitudFinal, float longitudFinal) {
        if(latitudFinal > latitud) {
            latitud = (float) (latitud + 10.0);
        } else if (latitudFinal < latitud) {
            latitud = (float) (latitud - 10.0);
        }
        super.trasladar(latitud, longitud);
    }
}
