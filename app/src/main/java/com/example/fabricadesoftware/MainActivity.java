package com.example.fabricadesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText inputWatts;
    EditText inputDias;
    EditText inputHoras;
    EditText inputTarifas;
    TextView resultado;
    TextView custo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputWatts = findViewById(R.id.input_watts);
        inputDias = findViewById(R.id.input_dias);
        inputHoras = findViewById(R.id.input_horas);
        inputTarifas = findViewById(R.id.input_tarifa);
        resultado = findViewById(R.id.resultado);
        custo = findViewById(R.id.custo);
    }


    public void calcular(View v) {
        double watts = Double.parseDouble(inputWatts.getText().toString());
        double dias = Double.parseDouble(inputDias.getText().toString());
        double horas = Double.parseDouble(inputHoras.getText().toString());
        double tarifa = Double.parseDouble(inputTarifas.getText().toString());

        double res = watts * dias * horas / 1000;
        double cus = res * tarifa;

        resultado.setText(String.valueOf(res));
        custo.setText(String.valueOf(cus));
    }
}