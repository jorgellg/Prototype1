package mx.edu.utng.memento1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Jorge Luis Lopez on 13/09/2016.
 */
public class Lienzo extends View {
    private TiroArco tiroArco;

    public Lienzo(Context context, TiroArco tiroArco){
        super(context);
        this.tiroArco = tiroArco;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(tiroArco!=null){
            tiroArco.dibujar(canvas, tiroArco.getColor());
        }
    }


    public TiroArco getTiroArco() {
        return tiroArco;
    }

    public void setTiroArco(TiroArco tiroArco) {
        this.tiroArco = tiroArco;
    }
}
