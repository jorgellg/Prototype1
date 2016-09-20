package mx.edu.utng.singleton2;

/**
 * Created by Jorge on 10/09/2016.
 */
public class Negocio {
    private static Negocio unicaInstancia;

    private String negocio;
    private String direccion;

    private Negocio(){this.negocio= "";}

    public void setNegocio(String negocio){this.negocio = negocio;}

    public String getNegocio() {
        return negocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static Negocio getUnicaInstancia(){
        if (unicaInstancia == null){
            unicaInstancia = new Negocio();
        }
        return unicaInstancia;
    }
}
