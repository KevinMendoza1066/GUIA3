package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edtNumero);

    }
    public void EvaluarNumero(View v){
        Intent i=new Intent(this,Evaluar.class);
        i.putExtra("num", edt1.getText().toString());
        startActivity(i);
    }
}