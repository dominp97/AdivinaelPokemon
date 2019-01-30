package com.pmdm.adivinaelpokemon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import static android.content.res.Configuration.ORIENTATION_LANDSCAPE;

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

        ViewGroup.LayoutParams lP0 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,250);
        ((LinearLayout.LayoutParams) lP).weight = 1;


        //Primer linear
        ImageButton btn = new ImageButton(this);
        btn.setImageDrawable(getResources().getDrawable(R.drawable.abra));
        ImageButton btn1 = new ImageButton(this);
        btn1.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
        ImageButton btn2 = new ImageButton(this);
        btn2.setImageDrawable(getResources().getDrawable(R.drawable.mew));


        listaLineales[0] = new LinearLayout(this);
        listaLineales[1] = new LinearLayout(this);
        listaLineales[2] = new LinearLayout(this);
        lNImagenes.addView(listaLineales[0]);
        lNImagenes.addView(listaLineales[1]);
        lNImagenes.addView(listaLineales[2]);



        //Tercer linear
        ImageButton btn8 = new ImageButton(this);
        btn8.setImageDrawable(getResources().getDrawable(R.drawable.jigglypuff));
        ImageButton btn9 = new ImageButton(this);
        btn9.setImageDrawable(getResources().getDrawable(R.drawable.snorlax));
        ImageButton btn10 = new ImageButton(this);
        btn10.setImageDrawable(getResources().getDrawable(R.drawable.venonat));

        listaLineales[2].addView(btn8);
        listaLineales[2].addView(btn9);
        listaLineales[2].addView(btn10);



        //Botones
        listaLineales[0].addView(btn);
        listaLineales[0].addView(btn1);
        listaLineales[0].addView(btn2);

        //Segundo linear
        ImageButton btn4 = new ImageButton(this);
        btn4.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
        ImageButton btn5 = new ImageButton(this);
        btn5.setImageDrawable(getResources().getDrawable(R.drawable.bullbasaur));
        ImageButton btn6 = new ImageButton(this);
        btn6.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));

        listaLineales[1].addView(btn4);
        listaLineales[1].addView(btn5);
        listaLineales[1].addView(btn6);




        btn.setLayoutParams(lP);
        btn1.setLayoutParams(lP);
        btn2.setLayoutParams(lP);
        btn4.setLayoutParams(lP);
        btn5.setLayoutParams(lP);
        btn6.setLayoutParams(lP);
        btn8.setLayoutParams(lP);
        btn9.setLayoutParams(lP);
        btn10.setLayoutParams(lP);

        if(this.getResources().getConfiguration().orientation == ORIENTATION_LANDSCAPE){
            btn.setLayoutParams(lP0);
            btn1.setLayoutParams(lP0);
            btn2.setLayoutParams(lP0);
            btn4.setLayoutParams(lP0);
            btn5.setLayoutParams(lP0);
            btn6.setLayoutParams(lP0);
            btn8.setLayoutParams(lP0);
            btn9.setLayoutParams(lP0);
            btn10.setLayoutParams(lP0);
        }
    }


    public String click(View view){



        return "";
    }


}
