package mx.edu.utng.singleton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_negocio;
    private EditText edt_direccion;
    private Button btn_crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_negocio = (EditText)findViewById(R.id.edt_negocio);
        edt_direccion = (EditText)findViewById(R.id.edt_direccion);
        btn_crear = (Button)findViewById(R.id.btn_crear);

        btn_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Negocio negocio = Negocio.getUnicaInstancia();
                negocio.setNegocio(edt_negocio.getText().toString());
                negocio.setDireccion(edt_direccion.getText().toString());
                Toast.makeText(MainActivity.this, "Negocio: "+negocio.getNegocio()+" "+negocio.getDireccion(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
