package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;

public class MultiplicarJava extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicar);


        Bundle operadores = getIntent().getExtras();
        int res2 = operadores.getInt("res2");
    }
}
