package mx.edu.utng.prototype2;

/**
 * Created by Jorge on 11/09/2016.
 */
public class Moneda implements Clonable {
    private String moneda;
    private String pais;
    private float cantidad;

    public Moneda(){
        this.moneda = "";
        this.pais = "";
        this.cantidad = 0.0f;
    }

    public Moneda(String moneda, String pais, float cantidad){
        this.moneda = moneda;
        this.pais = pais;
        this.cantidad = cantidad;
    }

    @Override
    public Clonable clonar() {
        Moneda clon = new Moneda();
        clon.moneda = moneda;
        clon.pais = pais;
        clon.cantidad = cantidad;
        return clon;
    }

    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public float getCantidad() {
        return cantidad;
    }
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}
