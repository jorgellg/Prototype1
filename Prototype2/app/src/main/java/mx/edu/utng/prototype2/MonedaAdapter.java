package mx.edu.utng.prototype2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jorge on 11/09/2016.
 */
public class MonedaAdapter extends ArrayAdapter<Moneda> {

    public MonedaAdapter(Context context, ArrayList<Moneda>monedas){super(context,0,monedas);}

    public View getView(int position, View convertView, ViewGroup parent){
        Moneda moneda = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.moneda_layout,parent,false);
        }

        TextView txvMoneda = (TextView)convertView.findViewById(R.id.txv_moneda);
        txvMoneda.setText(moneda.getMoneda()+" "+moneda.getPais()+" "+moneda.getCantidad());

        return convertView;
    }
}
