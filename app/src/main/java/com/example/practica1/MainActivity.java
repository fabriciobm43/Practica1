package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mostrarInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarInfo=(Button)findViewById(R.id.btn_enviar);
        mostrarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), MostrarInformacion.class);
                //startActivity(i);
                Intent intent = new Intent(getApplicationContext(), MostrarInformacion.class);
                EditText Nombre = (EditText)findViewById(R.id.et_Nombre);
                EditText Fecha = (EditText)findViewById(R.id.ed_FechaN);
                EditText Telefono = (EditText)findViewById(R.id.et_Telefono);
                RadioGroup group = (RadioGroup) findViewById(R.id.rd_group);
                int select= group.getCheckedRadioButtonId();
                RadioButton radioButton= (RadioButton) findViewById(select);
                String mensaje =radioButton.getText().toString();


                Bundle b = new Bundle();
                if (Nombre.getText().toString().isEmpty()) {
                    Nombre.setError("El campo esta vacío");
                }
                else if (Fecha.getText().toString().isEmpty()) {
                    Fecha.setError("El campo esta vacío");
                }
                else if (Telefono.getText().toString().isEmpty()) {
                    Telefono.setError("El campo esta vacío");
                }
                else{
                    b.putString("NOMBRE", Nombre.getText().toString());
                    b.putString("FECHA", Fecha.getText().toString());
                    b.putString("TELEFONO", Telefono.getText().toString());
                    b.putString("GENERO", mensaje);
                    intent.putExtras(b);
                    startActivity(intent);
                }
            }
        });
    }
}