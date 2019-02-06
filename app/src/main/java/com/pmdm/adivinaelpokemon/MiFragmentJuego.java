package com.pmdm.adivinaelpokemon;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MiFragmentJuego extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mi_fragment_juego);
    }


    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

    @Override
    protected boolean isValidFragment (String fragmentName) {

        if (PerferenciasPersonales.class.getName().equals(fragmentName)) return true;
        return false;
    }
}
