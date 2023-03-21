package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {
    TextView tvMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        tvMensaje = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        int positivos = bundle.getInt("positivos");
        int negativos = bundle.getInt("negativos");
        int multiplos = bundle.getInt("multiplos");
        float pares = bundle.getFloat("pares");
        tvMensaje.append("Cantidad de numeros negativos :" + negativos);
        tvMensaje.append("\nCantidad de numeros positivos : " + positivos);
        tvMensaje.append("\nCantidad de numeros Multiplos de 15 : " + multiplos);
        tvMensaje.append("\nSuma  de numeros pares :" + pares);
    }

    public void finalizar(View view) {
        finish();
    }
}