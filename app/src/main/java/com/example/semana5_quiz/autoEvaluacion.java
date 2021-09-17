package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class autoEvaluacion extends AppCompatActivity {

    private CheckBox checkBoxAct4, checkBoxAct5, checkBoxAct6;
    private Button botonFinalizar;
    private int puntaje4, puntaje5, puntaje6, puntajeTotal1, puntajeTotal2, puntajeFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_evaluacion);

        checkBoxAct4 = findViewById(R.id.checkBoxAct4);
        checkBoxAct5 = findViewById(R.id.checkBoxAct5);
        checkBoxAct6 = findViewById(R.id.checkBoxAct6);
        botonFinalizar = findViewById(R.id.botonFinalizar);

        puntajeTotal1 = getIntent().getExtras().getInt("puntajeTotal1");

        botonFinalizar.setOnClickListener(
                (v)->{
                    paraSumarPuntajes2();

                    //finalScore = evaluationScore + activityScore;

                    if (checkBoxAct4.isChecked() || checkBoxAct5.isChecked() || checkBoxAct6.isChecked()){
                        puntajeTotal2 = puntaje4 + puntaje5 + puntaje6;
                        puntajeFinal = puntajeTotal1 + puntajeTotal2;

                        Intent autoevaluacion = new Intent(this, autoEvaluacion.class);
                        autoevaluacion.putExtra("puntajeTotal1", puntajeTotal1);
                        startActivity(autoevaluacion);
                        finish();

                    } else{
                        Toast.makeText(this, "Escoge una opción para poder continuar", Toast.LENGTH_SHORT).show();

                    }
                }
        );

    }

    private void paraSumarPuntajes2() {

        if(checkBoxAct4.isChecked()){
            puntaje4 = 3;
        }

        if(checkBoxAct5.isChecked()){
            puntaje5 = 3;
        }

        if(checkBoxAct6.isChecked() ){
            puntaje6 = 0;
        }
        //  puntajeTotal1 = puntaje1 + puntaje2 + puntaje3;



    }
}