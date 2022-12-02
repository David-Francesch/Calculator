package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button cambiar;
    Button b0 ;
    Button b1 ;
    Button b2 ;
    Button b3 ;
    Button b4 ;
    Button b5 ;
    Button b6 ;
    Button b7 ;
    Button b8 ;
    Button b9 ;
    Button bEquals;
    Button bSum;
    Button bRes;
    Button bCe;
    Button exit;
    int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bEquals = (Button) findViewById(R.id.bEquals);
        bSum = (Button) findViewById(R.id.bSum);
        bRes = (Button) findViewById(R.id.bRes);
        bCe = (Button) findViewById(R.id.bCe);
        cambiar = (Button) findViewById(R.id.cambiar);
        cambiar.setOnClickListener(this);
        exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(this);

    }
    public void openMultiplicar(){
        Intent intentMultiply = new Intent(this, MultiplicarJava.class);
        intentMultiply.putExtra("resultado", resultado);
        startActivity(intentMultiply);
    }

    @Override
    public void onClick(View view) {
           if(cambiar.isPressed()){
               openMultiplicar();
           }
           if(exit.isPressed()){
               finishAndRemoveTask();
           }

    }


}