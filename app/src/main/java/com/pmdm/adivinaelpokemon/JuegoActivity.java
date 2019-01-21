package com.pmdm.adivinaelpokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Button;
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
        Button[] listabtn = new Button[cantidadImagenes];
        LinearLayout[] listaLineales = new LinearLayout[cantidadImagenes/3];
        /*
        //inicializar linear
        for(int i = 0; i< listaLineales.length;i++){
            listaLineales[i] = new LinearLayout(this);
            listaLineales[i].setLayoutParams(
                    new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));

        }

        lNImagenes.addView(listaLineales[0]);
        Button btn = new Button(this);
        Button btn1 = new Button(this);
        Button btn2 = new Button(this);
        Button btn3 = new Button(this);
        ViewGroup.LayoutParams lP = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        btn.setLayoutParams(lP);
        btn1.setLayoutParams(lP);
        btn2.setLayoutParams(lP);
        btn3.setLayoutParams(lP);
        listaLineales[1].addView(btn2);
        listaLineales[1].addView(btn3);
        listaLineales[0].addView(btn);
        listaLineales[0].addView(btn1);


        //rellenar linear

        for(int i = 0;i< listabtn.length / 3;i++){
            for(int j = 0; j< listabtn.length / 3;i++){

                //listaLineales[i].addView(new Button(this));

            }
            //listabtn[i] = new Button(this);
            listaLineales[i].setLayoutParams(
                    new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT));
            lNImagenes.addView(listaLineales[i]);
        }

        /*
        for(Button btn: listabtn){
            lNImagenes.addView(btn);
        }
        */

        ViewGroup.LayoutParams lP = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        ((LinearLayout.LayoutParams) lP).weight = 1;

        Button btn = new Button(this);
        Button btn1 = new Button(this);
        Button btn2 = new Button(this);

        btn.setLayoutParams(lP);
        btn1.setLayoutParams(lP);
        btn2.setLayoutParams(lP);
        listaLineales[0] = new LinearLayout(this);
        listaLineales[0].addView(btn);
        listaLineales[0].addView(btn1);
        listaLineales[0].addView(btn2);
        lNImagenes.addView(listaLineales[0]);


        //Segundo linear
        Button btn4 = new Button(this);
        Button btn5 = new Button(this);
        Button btn6 = new Button(this);

        btn4.setLayoutParams(lP);
        btn5.setLayoutParams(lP);
        btn6.setLayoutParams(lP);
        listaLineales[1] = new LinearLayout(this);
        listaLineales[1].addView(btn4);
        listaLineales[1].addView(btn5);
        listaLineales[1].addView(btn6);
        lNImagenes.addView(listaLineales[1]);


        //Tercer linear
        Button btn8 = new Button(this);
        Button btn9 = new Button(this);
        Button btn10 = new Button(this);

        btn8.setLayoutParams(lP);
        btn9.setLayoutParams(lP);
        btn10.setLayoutParams(lP);
        listaLineales[2] = new LinearLayout(this);
        listaLineales[2].addView(btn8);
        listaLineales[2].addView(btn9);
        listaLineales[2].addView(btn10);
        lNImagenes.addView(listaLineales[2]);
    }


}
