package mx.edu.utng.stateregalo;

import android.graphics.Canvas;

/**
 * Created by Jorge on 17/09/2016.
 */
public class Regalo {
    private  OpenClose estado;
    private Canvas canvas;


    public Regalo(OpenClose estado){
        this.estado = estado;
        this.canvas = canvas;
    }

    public void presionarBoton(){estado.abrirRegalo(this,canvas);}
    public  Canvas getCanvas (){ return canvas;}

    public void setCanvas(Canvas canvas){this.canvas = canvas;}
    public OpenClose getEstado(){return estado;}
    public void setEstado(OpenClose estado){ this.estado = estado;}
}
