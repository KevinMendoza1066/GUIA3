package com.example.ejercicio3;

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
        float suma = bundle.getFloat("suma");
        tvMensaje.setText("La suma de los ultimos 5 numeros es " + suma);
    }

    public void finalizar(View view) {
        finish();
    }
}