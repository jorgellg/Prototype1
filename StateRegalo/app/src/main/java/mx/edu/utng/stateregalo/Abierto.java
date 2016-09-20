package mx.edu.utng.stateregalo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Jorge on 17/09/2016.
 */
public class Abierto extends OpenClose {
    @Override
    public  void abrirRegalo(Regalo regalo, Canvas canvas){
        regalo.setEstado(new Cerrado());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;


        canvas.drawRect(mitadX*0.55f,mitadY*0.55f,mitadX*1.45f, mitadY*1.45f,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawRect(mitadX*0.5f,mitadY*0.5f,mitadX*1.5f, mitadY*1.5f,paint);

    }
}
