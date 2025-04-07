public abstract class Transporte {
    private float latitud;
    private float longitud;

    public void setLongitud(float newLongitud) {
        this.longitud = newLongitud;
    }

    public float getLongitud() {
        return longitud;
    }

    /*setter de latitud*/
    public void setLatitud(float newLatitud) {
        this.latitud = newLatitud;
    }
    /*getter de latitud*/
    public float getLatitud() {
        return this.latitud;
    }


    public abstract void trasladar(float latitud, float longitud);

}
