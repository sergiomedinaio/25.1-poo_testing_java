//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Transporte transporte = new Automovil();
        Automovil automovil = new Automovil();
        Automovil miAutomovil = automovil; //alias
        automovil.setLatitud(121.1f);
        miAutomovil.setLongitud(121.1f);
        automovil.tocarBocina();
        automovil.trasladar(122.1f, 122.1f);
        automovil.trasladar(122.1f, 122.1f);

    }
}