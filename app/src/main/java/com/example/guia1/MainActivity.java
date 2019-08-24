package com.example.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private Button boton2;
    private Button boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.calculadora);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencalculadora();
            }
        });

        boton2 = findViewById(R.id.misdatos);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmisdatos();
            }
        });

        boton3 = findViewById(R.id.login);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });

    }
    private void opencalculadora(){
        Intent intent= new  Intent(this,calculadora.class);
        startActivity(intent);
    }

    private void openmisdatos(){
        Intent intent = new Intent(this,Datos.class);
        startActivity(intent);
    }

    private void openlogin(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
