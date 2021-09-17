package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class preparacion extends AppCompatActivity {

    private CheckBox checkBoxAct1, checkBoxAct2, checkBoxAct3;
    private Button botonContinuarPreparacion3;
    private int puntaje1, puntaje2, puntaje3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparacion);

        checkBoxAct1 = findViewById(R.id.checkBoxAct1);
        checkBoxAct2 = findViewById(R.id.checkBoxAct2);
        checkBoxAct3 = findViewById(R.id.checkBoxAct3);
        botonContinuarPreparacion3 = findViewById(R.id.botonContinuar3);

        //botonContinuarPreparacion3.setVisibility(View.GONE);

       /* botonContinuarPreparacion3.setOnClickListener(
                (view)->{
                }
        );*/

        botonContinuarPreparacion3.setOnClickListener(
                (v)->{


                    if (checkBoxAct1.isChecked() || checkBoxAct2.isChecked() || checkBoxAct3.isChecked()){

                        if(checkBoxAct1.isChecked() ){
                            puntaje1 += 1;
                            //botonContinuarPreparacion3.setVisibility(View.VISIBLE);
                        }
                        if(checkBoxAct2.isChecked() ){
                            puntaje2 += 3;
                            //botonContinuarPreparacion3.setVisibility(View.VISIBLE);
                        }
                        if(checkBoxAct3.isChecked() ){
                            puntaje3 += 0;
                            //botonContinuarPreparacion3.setVisibility(View.VISIBLE);
                        }

                        Intent continuar2 = new Intent(this, autoEvaluacion.class);
                        startActivity(continuar2);
                        finish();

                        //botonContinuarPreparacion3.setVisibility(View.VISIBLE);

                    } else {
                        Toast.makeText(this, "Escoge una opción para poder continuar", Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }
}