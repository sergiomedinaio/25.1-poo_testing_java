//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.color = "red";
        automovil.cantidadRuedas = 4;
        automovil.latitud = 121.1f;
        automovil.longitud = 121.1f;
        automovil.medio = "terrestre";
        automovil.nombre = "Pequeño bandido";

        automovil.tocarBocina();

    }
}