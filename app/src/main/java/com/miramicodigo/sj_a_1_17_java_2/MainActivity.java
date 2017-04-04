package com.miramicodigo.sj_a_1_17_java_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * @author Gustavo Lizarraga
     * @date 04-04-17
     * */

    private Button btnRegistro;
    private Button btnIngresar;

    private EditText etUser;
    private EditText etPass;

    private String nombre;
    private String apellido;
    private String user;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = "Gustavo";
        apellido = "Lizarraga";
        user = "gus";
        pass = "12345";

        btnRegistro = (Button) findViewById(R.id.btnRegistro);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);

        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPassword);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        getApplicationContext(),
                        RegistroActivity.class);
                startActivity(i);
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresa();
            }
        });
    }

    public void ingresa() {
        if (etUser.getText().toString().equals("") ||
                etPass.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),
                    "Existen campos vacios.",
                    Toast.LENGTH_LONG).show();
        } else {
            if (etUser.getText().toString().equals(user) &&
                    etPass.getText().toString().equals(pass)) {
                Intent i = new Intent(getApplicationContext(),
                        DetalleActivity.class);
                i.putExtra("nom", nombre);
                i.putExtra("ape", apellido);
                i.putExtra("use", user);
                startActivity(i);
            }else {
                Toast.makeText(getApplicationContext(),
                        "Usuario o contrasenia incorrectos.",
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    public void irpaginaweb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.gdg.androidbolivia.com"));
        startActivity(intent);
    }

}
