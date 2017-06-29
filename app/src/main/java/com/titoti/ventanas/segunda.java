package com.titoti.ventanas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);

        texto = (TextView)findViewById(R.id.textoSegunda);
        Bundle b = this.getIntent().getExtras();

        texto.setText("Bienvenido " + b.getString("nombre"));
    }
}
