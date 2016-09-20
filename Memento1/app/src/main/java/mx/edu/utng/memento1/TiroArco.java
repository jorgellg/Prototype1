package mx.edu.utng.memento1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Jorge Luis Lopez on 13/09/2016.
 */
public class TiroArco {
    private int color;

    public TiroArco(){}

    public void dibujar(Canvas canvas, int color){
        Paint paint = new Paint();
        paint.setColor(Color.argb(178, 72, 140, 72));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(color);
        Path path = new Path();


        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 110, paint);


        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 100, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 90, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 80, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 70, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 60, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 50, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 40, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 30, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 20, paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle((canvas.getWidth()/2),
                (canvas.getHeight()/2), 10, paint);

        path.close();

        canvas.drawPath(path, paint);

    }

    public Memento1 guardarMemento() {
        return new Memento1(color);
    }
    public void restaurarMemento(Memento1 m) {
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
