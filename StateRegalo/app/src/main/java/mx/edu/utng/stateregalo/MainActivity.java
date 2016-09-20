package mx.edu.utng.stateregalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layPrincipal;
    private ImageButton btnPresionar;
    private Lienzo lienzo;
    private Cerrado estadoInicial;
    private Regalo regalo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layPrincipal = (LinearLayout)findViewById(R.id.lay_principal);
        btnPresionar = (ImageButton)findViewById(R.id.btn_presionar);
        estadoInicial = new Cerrado();
        regalo = new Regalo(estadoInicial);
        lienzo = new Lienzo(this,estadoInicial,regalo);
        layPrincipal.addView(lienzo);
        btnPresionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzo.setEstado(regalo.getEstado());
                regalo.presionarBoton();
                lienzo.invalidate();
            }
        });

    }

}
