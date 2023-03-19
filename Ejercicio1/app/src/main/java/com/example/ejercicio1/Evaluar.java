package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Evaluar extends AppCompatActivity {
    TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluar);
        tvMensaje = findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        String numero = bundle.getString("num");
        String evalua = EvaluaNumero(Integer.parseInt( numero));
        tvMensaje.setText("El numero ingresado es "+evalua);
    }
    public void finalizar(View view) {
        finish();
    }
    public String EvaluaNumero (int numero){
        if(numero>0){
            return "positivo";
        }else if (numero<0){
            return "negativo";
        }else{
            return "nulo";
        }
    }
}