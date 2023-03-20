package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.edtNumero);
    }
    public void Evaluar(View view){
        Intent intento = new Intent(this,EvaluarNumero.class);
        intento.putExtra("numero",et1.getText().toString());
        startActivity(intento);
    }

}