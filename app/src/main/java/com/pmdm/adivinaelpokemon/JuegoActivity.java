package com.pmdm.adivinaelpokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class JuegoActivity extends AppCompatActivity {

    LinearLayout lNImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        lNImagenes = findViewById(R.id.imagenes);
        Button btn = new Button(this);

        lNImagenes.addView(btn);
    }


}
