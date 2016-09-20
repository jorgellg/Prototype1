package mx.edu.utng.prototype1;

/**
 * Created by Jorge on 10/09/2016.
 */
public class Celular implements Clonable {
    private String modelo;
    private String color;
    private float cantidad;
    private float precio;

    public Celular(){
        this.modelo = "";
        this.color = "";
        this.cantidad = 0.0f;
        this.precio = 0.0f;
    }

    public Celular(String modeloso, String color, float cantidad){
        this.modelo = modelo;
        this.color = color;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public Clonable clonar() {
        Celular clon = new Celular();
        clon.modelo = modelo;
        clon.color = color;
        clon.cantidad = cantidad;
        clon.precio = precio;
        return clon;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
