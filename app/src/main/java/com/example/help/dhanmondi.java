package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dhanmondi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanmondi);
    }

    public void harun(View view) {
        Intent harun = new Intent(dhanmondi.this,harun.class);
        startActivity(harun);
    }

    public void ibne(View view) {
        Intent ibne=new Intent(dhanmondi.this,ibne.class);
        startActivity(ibne);
    }

    public void square(View view) {
        Intent square=new Intent(dhanmondi.this,square.class);
        startActivity(square);
    }

    public void central(View view) {
        Intent central=new Intent(dhanmondi.this, central.class);
        startActivity(central);
    }
}