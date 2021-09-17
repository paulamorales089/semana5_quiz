package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class preparacion extends AppCompatActivity {

    private CheckBox checkBoxAct1, checkBoxAct2, checkBoxAct3;
    private Button botonContinuarPreparacion3;
    private int puntaje1, puntaje2, puntaje3,puntajeTotal1;

    private Boolean pasoAutoevaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparacion);

        checkBoxAct1 = findViewById(R.id.checkBoxAct1);
        checkBoxAct2 = findViewById(R.id.checkBoxAct2);
        checkBoxAct3 = findViewById(R.id.checkBoxAct3);
        botonContinuarPreparacion3 = findViewById(R.id.botonContinuar3);


         botonContinuarPreparacion3.setOnClickListener(
                (v)->{
                   paraSumarPuntajes();
                   puntajeTotal1 = puntaje1 + puntaje2 + puntaje3;
                    //finalScore = evaluationScore + activityScore;

                    if (checkBoxAct1.isChecked() || checkBoxAct2.isChecked() || checkBoxAct3.isChecked()){
                        //botonContinuarPreparacion3.setEnabled(true);
                        Intent autoevaluacion = new Intent(this, autoEvaluacion.class);
                        autoevaluacion.putExtra("puntajeTotal1", puntajeTotal1);
                        startActivity(autoevaluacion);
                        finish();

                    } else{
                    Toast.makeText(this, "Escoge una opción para poder continuar", Toast.LENGTH_SHORT).show();
                        //botonContinuarPreparacion3.setEnabled(false);



                    }
                }
        );

    }

    private void paraSumarPuntajes() {

        if(checkBoxAct1.isChecked()){
            puntaje1 = 1;
        }

        if(checkBoxAct2.isChecked()){
            puntaje2 = 3;
        }

        if(checkBoxAct3.isChecked() ){
            puntaje3 = 0;
        }
      //  puntajeTotal1 = puntaje1 + puntaje2 + puntaje3;
    }

}