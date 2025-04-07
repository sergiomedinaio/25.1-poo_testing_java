//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        //Transporte transporte = new Automovil();
        //transporte.color = "";

        automovil.color = "red";
        automovil.cantidadRuedas = 4;
        automovil.latitud = 121.1f;
        automovil.longitud = 121.1f;
        automovil.medio = "terrestre";
        automovil.nombre = "Pequeño bandido";

        automovil.tocarBocina();
        automovil.trasladar(122.1f, 122.1f);
        automovil.trasladar(122.1f, 122.1f);

    }
}