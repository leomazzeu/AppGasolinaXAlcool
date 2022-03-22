package com.example.appgasolinaalcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

     EditText editGasolina;
     EditText editAlcool;
     TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editGasolina = findViewById(R.id.editGasolina);
        editAlcool = findViewById(R.id.editAlcool);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularCombustivel(View view) {

        double gasolina = editGasolina.getText().length() > 0 ? Double.parseDouble(editGasolina.getText().toString()) : 0;
        double alcool = editAlcool.getText().length() > 0 ? Double.parseDouble(editAlcool.getText().toString()) : 0;

        double calculo = (alcool / gasolina);

        if(gasolina == 0 || alcool == 0) {
            textResultado.setText("Insira valores válidos!");
        } else {
            if(calculo >= 0.70) {
                textResultado.setText("Abasteça com gasolina!");
            } else {
                textResultado.setText("Abasteça com álcool!");
            }
        }
    }
}