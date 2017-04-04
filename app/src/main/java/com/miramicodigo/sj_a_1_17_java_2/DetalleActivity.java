package com.miramicodigo.sj_a_1_17_java_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalleActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 04-04-17
     * */

    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvUser;

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvApellido = (TextView) findViewById(R.id.tvApellido);
        tvUser = (TextView) findViewById(R.id.tvUsuario);

        btnVolver = (Button) findViewById(R.id.btnVolver);

        Bundle bundle = getIntent().getExtras();

        String nom = bundle.getString("nom").toString();
        String ape = bundle.getString("ape").toString();
        String use = bundle.getString("use").toString();

        tvNombre.setText(nom);
        tvApellido.setText(ape);
        tvUser.setText(use);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
