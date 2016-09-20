package mx.edu.utng.stateregalo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Jorge on 17/09/2016.
 */
public class Cerrado extends OpenClose {
    @Override
    public void abrirRegalo(Regalo regalo, Canvas canvas){
        regalo.setEstado(new Abierto());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;

        canvas.drawRect(mitadX*0.5f,mitadY*0.5f,mitadX*1.5f,mitadY*1.5f, paint);
        paint.setColor(Color.BLUE);
        canvas.drawRect(mitadX*0.9f,mitadY*0.5f,mitadX*1.1f,mitadY*1.5f, paint);
        paint.setColor(Color.BLUE);
        canvas.drawRect(mitadX*0.5f,mitadY*0.9f,mitadX*1.5f,mitadY*1.1f,paint);

    }
}
