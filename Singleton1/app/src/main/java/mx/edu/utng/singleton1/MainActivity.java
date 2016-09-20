package mx.edu.utng.singleton1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_domicilio;
    private Button btn_crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_domicilio = (EditText)findViewById(R.id.edt_domicilio);
        btn_crear = (Button)findViewById(R.id.btn_crear);

        btn_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Domicilio domicilio = Domicilio.getUnicaInstancia();
                domicilio.setDomicilio(edt_domicilio.getText().toString());
                Toast.makeText(MainActivity.this,"Domicilio: "+domicilio.getDomicilio(),Toast.LENGTH_SHORT).show();


            }
        });
    }
}
