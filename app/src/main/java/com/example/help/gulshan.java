package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gulshan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulshan);
    }

    public void cure(View view) {
        Intent cure=new Intent(gulshan.this,gulshanphy.class);
        startActivity(cure);
    }

    public void labaid(View view) {
        Intent labaid=new Intent(gulshan.this,labaid.class);
        startActivity(labaid);
    }

    public void centralhospita(View view) {
        Intent centralhospita=new Intent(gulshan.this,central.class);
        startActivity(centralhospita);
    }

    public void addin(View view) {
        Intent addin=new Intent(gulshan.this,addin.class);
        startActivity(addin);
    }
}