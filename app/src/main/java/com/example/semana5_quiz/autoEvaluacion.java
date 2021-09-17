package com.example.semana5_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class autoEvaluacion extends AppCompatActivity {

    private CheckBox checkBoxAct4, checkBoxAct5, checkBoxAct6;
    private Button botonFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_evaluacion);

        checkBoxAct4 = findViewById(R.id.checkBoxAct4);
        checkBoxAct5 = findViewById(R.id.checkBoxAct5);
        checkBoxAct6 = findViewById(R.id.checkBoxAct6);
        botonFinalizar = findViewById(R.id.botonFinalizar);
    }
}