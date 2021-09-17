package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nuevoRegistro extends AppCompatActivity {

    private EditText nombreEstudianteEspacio;
    private EditText codigoEstudianteEspacio;
    private Button botonContinuarRegistro2;

    private String nombreEstudiante, codigoEstudiante;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_registro);

        nombreEstudianteEspacio = findViewById(R.id.nombreEstudianteEspacio);
        codigoEstudianteEspacio = findViewById(R.id.codigoEstudianteEspacio);
        botonContinuarRegistro2 = findViewById(R.id.botonContinuar2);

        preferences = getSharedPreferences("nombreYCodigoEstudiante", MODE_PRIVATE);


        botonContinuarRegistro2.setOnClickListener(
                (v)-> {

                    nombreEstudiante = nombreEstudianteEspacio.getText().toString();
                    codigoEstudiante = codigoEstudianteEspacio.getText().toString();

                    if (nombreEstudiante.isEmpty() || codigoEstudiante.isEmpty()) {
                        Toast.makeText(this, "Se necesita el nombre y codigo del estudiante para continuar",
                                Toast.LENGTH_LONG).show();
                    } else{

                        preferences.edit().toString("nombreEstudiante",nombreEstudiante).apply();
                        preferences.edit().toString("codigoEstudiante",codigoEstudiante).apply();

                        Intent continuar = new Intent(this, preparacion.class);
                        startActivity(continuar);
                        finish();
                }

                }
        );
    }

}