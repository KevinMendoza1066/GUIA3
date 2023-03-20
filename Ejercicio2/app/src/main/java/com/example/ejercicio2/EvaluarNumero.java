package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EvaluarNumero extends AppCompatActivity {
    TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar_numero);
        tvMensaje=findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        String numero = bundle.getString("numero");
        String MensajeValidado =  EvaluaNumero(Integer.parseInt( numero));
        tvMensaje.setText(MensajeValidado);
    }
    public void finalizar(View view) {
        finish();
    }
    public String EvaluaNumero (int numero){
        numero = Math.abs(numero);
        if(numero<10){
            return "El numero tiene 1 cifra";
        }else if (numero<100){
            return "El numero tiene 2 cifras";
        }else if (numero<1000){
            return "El numero tiene 3 cifras";
        }else {
            return "Error , el numero de cifras maximo deben ser 3";
        }
    }
}