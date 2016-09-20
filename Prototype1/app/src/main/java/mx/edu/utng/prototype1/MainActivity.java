package mx.edu.utng.prototype1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edt_tipo;
    private EditText edt_color;
    private EditText edt_cantidad;
    private EditText edt_precio;
    private Button btn_clonar;
    private GridView grvCelulares;
    private ArrayList<Celular>celulares;
    private Celular celular;
    private CelularAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_tipo = (EditText)findViewById(R.id.edt_modelo);
        edt_color = (EditText)findViewById(R.id.edt_color);
        edt_cantidad =(EditText)findViewById(R.id.edt_cantidad);
        edt_precio =(EditText)findViewById(R.id.edt_precio);
        btn_clonar=(Button)findViewById(R.id.btn_clonar);
        grvCelulares = (GridView)findViewById(R.id.grv_celulares);
        celulares = new ArrayList<Celular>();
        celular = new Celular();
        btn_clonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celular.setModelo(edt_tipo.getText().toString());
                celular.setColor(edt_color.getText().toString());
                celular.setCantidad(Float.parseFloat(edt_cantidad.getText().toString()));
                celular.setPrecio(Float.parseFloat(edt_precio.getText().toString()));
                Celular clon = (Celular)celular.clonar();
                celulares.add(clon);

                adapter = new CelularAdapter(MainActivity.this,celulares);
                grvCelulares.setAdapter(adapter);
            }
        });


    }
}
