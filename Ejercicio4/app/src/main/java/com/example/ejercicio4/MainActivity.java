package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float SumaPares;
    int CantNumeros;
    int CantNegativos;
    int CantPositivos;
    int CantMultiplos; //Multiplos de 15
    TextView tvMensaje;
    EditText edtNumero;
    Button IngresarNumero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMensaje = findViewById(R.id.tvMensaje);
        edtNumero = findViewById(R.id.edtNumero2);
        IngresarNumero = findViewById(R.id.button);
        tvMensaje.setText("La cantidad de numeros ingresados es 0");
    }

    public void IngresarNumero (View view){
        float Numero = Float.parseFloat( edtNumero.getText().toString());
        CantNumeros++;
        if(CantNumeros<11){
            tvMensaje.setText("La cantidad de numeros ingresados es "+CantNumeros);
            //Si es par
            if (Numero%2==0){
                SumaPares = SumaPares +  Float.parseFloat(edtNumero.getText().toString());
            }
            //Si es negativo o positivo
            if (Numero>=0){
                CantPositivos++;
            }else{
                CantNegativos++;
            }

            //Si es multiplo de 15
            if (Numero%15==0){
                CantMultiplos++;
            }

            edtNumero.setText("");
            if(CantNumeros==10){
                edtNumero.setText("0");
                IngresarNumero.setText("Mostrar Datos");
                edtNumero.setVisibility(View.INVISIBLE);
            }
        }else{
            Intent intento = new Intent(this,Mensaje.class);
            intento.putExtra("positivos",CantPositivos);
            intento.putExtra("negativos",CantNegativos);
            intento.putExtra("multiplos",CantMultiplos);
            intento.putExtra("pares",SumaPares);
            startActivity(intento);
        }
    }
}