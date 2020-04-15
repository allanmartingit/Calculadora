package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCalcularOnClick(View v){
        EditText txtAltura = (EditText)findViewById(R.id.txtAltura);
        EditText txtpeso = (EditText)findViewById(R.id.txtPeso);

        double altura = Double.parseDouble(txtAltura.getText().toString());
        int peso = Integer.parseInt(txtpeso.getText().toString());

        double imc = peso / Math.pow(altura,2);
        if(imc > 40) {
            Toast.makeText(this,"OBESIDADE GRAVE!",Toast.LENGTH_LONG).show();
        }else if (imc > 30){
            Toast.makeText(this,"OBESIDADE!",Toast.LENGTH_LONG).show();
        }else if (imc > 25){
            Toast.makeText(this,"SOBREPESO!",Toast.LENGTH_LONG).show();
        }else if (imc > 18){
            Toast.makeText(this,"NORMAL!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"MAGREZA!",Toast.LENGTH_LONG).show();
        }

    }
}


