package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtLado1, edtLado2,edtLado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLado1 = findViewById(R.id.edtLado1);
        edtLado2= findViewById(R.id.edtLado2);
        edtLado3=findViewById(R.id.edtLado3);
    }

    public void EnviarDatos(View view){
        float Lado1 = Float.parseFloat(edtLado1.getText().toString());
        float Lado2 = Float.parseFloat(edtLado2.getText().toString());
        float Lado3 = Float.parseFloat(edtLado3.getText().toString());
        Intent  intento = new Intent(this,Validacion.class);
        intento.putExtra("lado1",Lado1);
        intento.putExtra("lado2",Lado2);
        intento.putExtra("lado3",Lado3);
        startActivity(intento);
    }
}