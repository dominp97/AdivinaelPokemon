package com.pmdm.adivinaelpokemon;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class JuegoActivity extends AppCompatActivity {

    LinearLayout lNImagenes;
    int cantidadImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        cantidadImagenes = Integer.parseInt(message);
        lNImagenes = findViewById(R.id.imagenes);
        ImageButton[] listabtn = new ImageButton[cantidadImagenes];
        LinearLayout[] listaLineales = new LinearLayout[cantidadImagenes/3];





        ViewGroup.LayoutParams lP = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        ((LinearLayout.LayoutParams) lP).weight = 1;

        ImageButton btn = new ImageButton(this);
        btn.setImageDrawable(getResources().getDrawable(R.drawable.abra));
        ImageButton btn1 = new ImageButton(this);
        btn1.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
        ImageButton btn2 = new ImageButton(this);
        btn2.setImageDrawable(getResources().getDrawable(R.drawable.mew));

        btn.setLayoutParams(lP);
        btn1.setLayoutParams(lP);
        btn2.setLayoutParams(lP);
        listaLineales[0] = new LinearLayout(this);
        listaLineales[0].addView(btn);
        listaLineales[0].addView(btn1);
        listaLineales[0].addView(btn2);
        lNImagenes.addView(listaLineales[0]);


        //Segundo linear
        ImageButton btn4 = new ImageButton(this);
        btn4.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
        ImageButton btn5 = new ImageButton(this);
        btn5.setImageDrawable(getResources().getDrawable(R.drawable.bullbasaur));
        ImageButton btn6 = new ImageButton(this);
        btn6.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));

        btn4.setLayoutParams(lP);
        btn5.setLayoutParams(lP);
        btn6.setLayoutParams(lP);
        listaLineales[1] = new LinearLayout(this);
        listaLineales[1].addView(btn4);
        listaLineales[1].addView(btn5);
        listaLineales[1].addView(btn6);
        lNImagenes.addView(listaLineales[1]);


        //Tercer linear
        ImageButton btn8 = new ImageButton(this);
        btn8.setImageDrawable(getResources().getDrawable(R.drawable.jigglypuff));
        ImageButton btn9 = new ImageButton(this);
        btn9.setImageDrawable(getResources().getDrawable(R.drawable.snorlax));
        ImageButton btn10 = new ImageButton(this);
        btn10.setImageDrawable(getResources().getDrawable(R.drawable.venonat));

        btn8.setLayoutParams(lP);
        btn9.setLayoutParams(lP);
        btn10.setLayoutParams(lP);
        listaLineales[2] = new LinearLayout(this);
        listaLineales[2].addView(btn8);
        listaLineales[2].addView(btn9);
        listaLineales[2].addView(btn10);
        lNImagenes.addView(listaLineales[2]);
    }


    public String click(View view){



        return "";
    }


}
