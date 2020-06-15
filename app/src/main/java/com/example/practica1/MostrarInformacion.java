package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MostrarInformacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_informacion);
        TextView txtSaludo = (TextView)findViewById(R.id.txtMensaje);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola!, Bienvenido \n " +
                bundle.getString("NOMBRE")+
                "\n Su genero es: \n " +
                bundle.getString("GENERO")+
                "\n Su fecha de nacimiento es: \n " +
                bundle.getString("FECHA")+
                "\nSu telefono es: \n " +
                bundle.getString("TELEFONO"));
    }
}