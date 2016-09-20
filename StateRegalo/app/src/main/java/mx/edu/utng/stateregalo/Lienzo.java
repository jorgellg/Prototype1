package mx.edu.utng.stateregalo;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Jorge on 17/09/2016.
 */
public class Lienzo extends View {
    private OpenClose estado;
    private Regalo regalo;
    public Lienzo(Context context, OpenClose estado, Regalo regalo){
        super(context);
        this.estado = estado;
        this.regalo = regalo;

    }
    @Override
    protected void onDraw(Canvas canvas){
        if(estado!=null&&regalo!=null){
            regalo.setCanvas(canvas);
            estado.abrirRegalo(regalo,canvas);
        }
    }
    public OpenClose getEstado(){return estado;}
    public void setEstado(OpenClose estado){this.estado =estado;}

}
