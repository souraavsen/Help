package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mirpur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirpur);
    }

    public void ahsania(View view) {
        Intent ahsania=new Intent(mirpur.this,ahsania.class);
        startActivity(ahsania);
    }

    public void almadina(View view) {
        Intent almadina=new Intent(mirpur.this,almadina.class);
        startActivity(almadina);
    }

    public void alrashid(View view) {
        Intent alrashid=new Intent(mirpur.this,alrashid.class);
        startActivity(alrashid);
    }

    public void care(View view) {
        Intent care=new Intent(mirpur.this,care.class);
        startActivity(care);
    }
}