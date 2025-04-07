public class Automovil extends MedioTransporte {
    private int cantidadRuedas;
    private String color;

    public void tocarBocina() {
        System.out.println("Estoy tocando bocina...");
    }

    public void trasladar(float latitudFinal, float longitudFinal) {
        if(latitudFinal > this.getLatitud()) {
            float newLatitud = (float) (this.getLatitud() + 10.0);
            this.setLatitud(newLatitud);
        } else if (latitudFinal < this.getLatitud()) {
            float newLatitud = (float) (this.getLatitud() - 10.0);
            this.setLatitud(newLatitud);
        }
        super.trasladar(this.getLatitud(), this.getLongitud());
    }
}
