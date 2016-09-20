package mx.edu.utng.singleton1;

/**
 * Created by Jorge on 10/09/2016.
 */
public class Domicilio {
    private static Domicilio unicaInstancia;

    private String domicilio;
    private int numero;

    private Domicilio(){this.domicilio = "";}

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public static Domicilio getUnicaInstancia(){
        if (unicaInstancia == null){
            unicaInstancia = new Domicilio();
        }
        return unicaInstancia;
    }
}
