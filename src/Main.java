//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        Automovil automovil = new Automovil();
        automovil.color = "red";
        automovil.cantidadRuedas = 4;
        automovil.latitud = 121.1f;
        automovil.longitud = 121.1f;
        automovil.medio = "terrestre";
        automovil.nombre = "Pequeño bandido";

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}