package mx.edu.utng.prototype1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jorge on 10/09/2016.
 */
public class CelularAdapter extends ArrayAdapter<Celular> {

    public CelularAdapter(Context context, ArrayList<Celular>celular){super(context,0,celular); }

    public View getView(int position, View convertView, ViewGroup parent){
        Celular celular = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.celular_layout,parent,false);
        }
        TextView txvCelular = (TextView)convertView.findViewById(R.id.tvx_celular);
        txvCelular.setText(celular.getModelo()+" "+celular.getColor()+" "+celular.getCantidad()+" "+celular.getPrecio());

        return convertView;


        }

}
