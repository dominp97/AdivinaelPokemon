package com.pmdm.adivinaelpokemon;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Random;

import static android.content.res.Configuration.ORIENTATION_LANDSCAPE;

public class JuegoActivity extends AppCompatActivity implements View.OnClickListener{

    HashMap<String, Object> mapa;
    LinearLayout lNImagenes;
    int cantidadImagenes;
    TextView tv1;
    String[] poke;
    Bundle savedInstanceState;


    //region onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        this.savedInstanceState = savedInstanceState;
        inicializar();


    }

    public void aleatoriezar(){
        Random r = new Random();
        tv1.setText(poke[r.nextInt(9)]);
    }

    public void inicializar(){
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        cantidadImagenes = Integer.parseInt(message);
        lNImagenes = findViewById(R.id.imagenes);
        ImageButton[] listabtn = new ImageButton[cantidadImagenes];
        LinearLayout[] listaLineales = new LinearLayout[cantidadImagenes/3];

        ViewGroup.LayoutParams lP = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        ((LinearLayout.LayoutParams) lP).weight = 1;

        ViewGroup.LayoutParams lP0 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,250);
        ((LinearLayout.LayoutParams) lP).weight = 1;


        Button btn22 = findViewById(R.id.button2);
        btn22.setText(lNImagenes.getLayoutParams().height+"");

        int altura = lNImagenes.getLayoutParams().height /3;


        //Parametros layout linear
        ViewGroup.LayoutParams llP = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,0);//altura
        ((LinearLayout.LayoutParams) llP).weight = 3;


        //Creamos botones
        ImageButton btn = new ImageButton(this);
        btn.setImageDrawable(getResources().getDrawable(R.drawable.abra));
        btn.setOnClickListener(this);
        ImageButton btn1 = new ImageButton(this);
        btn1.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
        btn1.setOnClickListener(this);
        ImageButton btn2 = new ImageButton(this);
        btn2.setImageDrawable(getResources().getDrawable(R.drawable.mew));
        btn2.setOnClickListener(this);
        ImageButton btn4 = new ImageButton(this);
        btn4.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
        btn4.setOnClickListener(this);
        ImageButton btn5 = new ImageButton(this);
        btn5.setImageDrawable(getResources().getDrawable(R.drawable.bullbasaur));
        btn5.setOnClickListener(this);
        ImageButton btn6 = new ImageButton(this);
        btn6.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
        btn6.setOnClickListener(this);
        ImageButton btn8 = new ImageButton(this);
        btn8.setImageDrawable(getResources().getDrawable(R.drawable.jigglypuff));
        btn8.setOnClickListener(this);
        ImageButton btn9 = new ImageButton(this);
        btn9.setImageDrawable(getResources().getDrawable(R.drawable.snorlax));
        btn9.setOnClickListener(this);
        ImageButton btn10 = new ImageButton(this);
        btn10.setImageDrawable(getResources().getDrawable(R.drawable.venonat));
        btn10.setOnClickListener(this);


        //Creamos layouts
        listaLineales[0] = new LinearLayout(this);
        listaLineales[1] = new LinearLayout(this);
        listaLineales[2] = new LinearLayout(this);



        listaLineales[0].addView(btn);
        listaLineales[0].addView(btn1);
        listaLineales[0].addView(btn2);
        listaLineales[1].addView(btn4);
        listaLineales[1].addView(btn5);
        listaLineales[1].addView(btn6);
        listaLineales[2].addView(btn8);
        listaLineales[2].addView(btn9);
        listaLineales[2].addView(btn10);


        lNImagenes.addView(listaLineales[0]);
        lNImagenes.addView(listaLineales[1]);
        lNImagenes.addView(listaLineales[2]);


        listaLineales[0].setLayoutParams(llP);
        listaLineales[1].setLayoutParams(llP);
        listaLineales[2].setLayoutParams(llP);


        btn.setLayoutParams(lP);
        btn1.setLayoutParams(lP);
        btn2.setLayoutParams(lP);
        btn4.setLayoutParams(lP);
        btn5.setLayoutParams(lP);
        btn6.setLayoutParams(lP);
        btn8.setLayoutParams(lP);
        btn9.setLayoutParams(lP);
        btn10.setLayoutParams(lP);


        //Creamos random de nombres

        tv1 = new TextView(this);

        Resources res = getResources();
        poke = res.getStringArray(R.array.pokemon);
        Random r = new Random();
        tv1.setText(poke[r.nextInt(9)]);

        //Atributos texto
        ViewGroup.LayoutParams llPt = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);//altura
        ((LinearLayout.LayoutParams) llP).weight = 1;

        tv1.setLayoutParams(llPt);
        lNImagenes.addView(tv1);


        new contador().execute("");

        mapa = new HashMap<String, Object>();

        mapa.put("Abra", btn);
        mapa.put("Evee", btn1);
        mapa.put("Mew", btn2);
        mapa.put("Charmander", btn4);
        mapa.put("Bulbasur", btn5);
        mapa.put("Squirtle", btn6);
        mapa.put("Jigglypuff", btn8);
        mapa.put("Snorlax", btn9);
        mapa.put("Venonaut", btn10);
    }

    //endregion

    //region Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my, menu);
        //TODO cambiar aqui para nuestro menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(getApplicationContext(),"Has seleccionado: "+item.getTitle(),Toast.LENGTH_LONG).show();
        if(item.getTitle().equals("Reinciar")){
            inicializar();
        }else{
            startActivity(new Intent(this, MiFragmentJuego.class));
        }


        return super.onOptionsItemSelected(item);
    }
    //endregion



    //
    ///
    ///
    ///
    ///
    public void click(View view){
        ImageButton img = (ImageButton) view;
        ImageButton imgT = (ImageButton) mapa.get(tv1.getText());
        CharSequence text;
        if(img == imgT){
            text = "Puto amo tio!";
        }else{
            text = "no tio!";
        }
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    @Override
    public void onClick(View v) {
        ImageButton img = (ImageButton) v;
        ImageButton imgT = (ImageButton) mapa.get(tv1.getText());
        CharSequence text;
        if(img == imgT){
            text = "Puto amo tio!";
            aleatoriezar();
        }else{
            text = "no tio!";
        }
        Context context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    //region reloj
    private class contador extends AsyncTask<String, Void, String> {

        private Button btnT;
        private int contrareloj;

        @Override
        protected String doInBackground(String... strings) {

            try {
                while(contrareloj > 0){

                    contrareloj--;
                    btnT.setText(contrareloj+"");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                btnT.setText("No va");
            }
            return contrareloj+"";
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            contrareloj = 60;
            btnT = findViewById(R.id.button2);
            btnT.setText(contrareloj+"");
        }
    }
    //endregion


}
