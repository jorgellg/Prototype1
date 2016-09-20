package mx.edu.utng.prototype2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edt_moneda;
    private EditText edt_pais;
    private EditText edt_cantidad;
    private Button btn_clonar;
    private GridView grv_monedas;
    private ArrayList<Moneda>monedas;
    private Moneda moneda;
    private MonedaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_moneda = (EditText)findViewById(R.id.edt_moneda);
        edt_pais = (EditText)findViewById(R.id.edt_pais);
        edt_cantidad = (EditText)findViewById(R.id.edt_cantidad);
        btn_clonar = (Button)findViewById(R.id.btn_clonar);
        grv_monedas = (GridView)findViewById(R.id.grv_monedas);
        monedas = new ArrayList<Moneda>();
        moneda = new Moneda();
        btn_clonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moneda.setMoneda(edt_moneda.getText().toString());
                moneda.setPais(edt_pais.getText().toString());
                moneda.setCantidad(Float.parseFloat(edt_cantidad.getText().toString()));
                Moneda clon = (Moneda)moneda.clonar();
                monedas.add(clon);
                adapter = new MonedaAdapter(MainActivity.this,monedas);
                grv_monedas.setAdapter(adapter);

            }
        });
    }
}
