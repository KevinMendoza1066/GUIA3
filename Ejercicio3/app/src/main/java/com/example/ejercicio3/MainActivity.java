package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float Suma;
    int CantNumeros;
    TextView tvMensaje;
    EditText edtNumero;
    Button IngresarNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMensaje = findViewById(R.id.tvMensaje);
        edtNumero = findViewById(R.id.edtNumero);
        IngresarNumero = findViewById(R.id.button);
        tvMensaje.setText("La cantidad de numeros ingresados es 0");
    }
    public void IngresarNumero (View view){
        CantNumeros++;
        if(CantNumeros<11){
            tvMensaje.setText("La cantidad de numeros ingresados es "+CantNumeros);
            if (CantNumeros>5){
                Suma = Suma + Integer.parseInt(edtNumero.getText().toString());
            }
            edtNumero.setText("");
            if(CantNumeros==10){
                edtNumero.setText("0");
                IngresarNumero.setText("Mostrar Suma");
                edtNumero.setVisibility(View.INVISIBLE);
            }
        }else{
            Intent intento = new Intent(this,Mensaje.class);
            intento.putExtra("suma",Suma);
            startActivity(intento);
        }
    }
}