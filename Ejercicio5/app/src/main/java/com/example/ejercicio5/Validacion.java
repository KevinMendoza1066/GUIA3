package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Validacion extends AppCompatActivity {
    TextView tvMensaje;
    ImageView imvTriangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion);
        tvMensaje = findViewById(R.id.textView);
        imvTriangulo = findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        float Lado1 = bundle.getFloat("lado1");
        float Lado2 = bundle.getFloat("lado2");
        float Lado3 = bundle.getFloat("lado3");
        String Mensaje = EvaluarTriangulo(Lado1,Lado2,Lado3);
        tvMensaje.setText(Mensaje);
    }
    public String EvaluarTriangulo(float Lado1 ,float Lado2 ,float Lado3 ){
        if(Lado1 == Lado2 && Lado2==Lado3){
            imvTriangulo.setImageResource(R.drawable.equilatero);
            return "Es equilatero";
        }else if(Lado1 == Lado2 && Lado1!=Lado3 || Lado2 == Lado3 && Lado1!=Lado3 || Lado3 == Lado1 && Lado1!=Lado2 ){
            imvTriangulo.setImageResource(R.drawable.isoceles);
            return "Es Isoceles";
        }else {
            imvTriangulo.setImageResource(R.drawable.escaleno);
            return "Es Escaleno";
        }
    }
    public void finalizar(View view) {
        finish();
    }
}