package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nombresYaRegistrados;

    private Button botonRegistro1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nombresYaRegistrados = findViewById(R.id.nombresYaRegistrados);

        botonRegistro1 = findViewById(R.id.botonRegistro1);

        botonRegistro1.setOnClickListener(
                (v)->{
                    Intent registro = new Intent(this,nuevoRegistro.class);
                    startActivity(registro);

                }
        );





    }
}