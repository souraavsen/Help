package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dhanmondi(View v){
        Intent dhanmondi=new Intent(MainActivity.this, dhanmondi.class);
        startActivity(dhanmondi);
    }

    public void mirpur(View view) {
        Intent mirpur=new Intent(MainActivity.this, mirpur.class);
        startActivity(mirpur);
    }

    public void gulshan(View view) {
        Intent gulshan=new Intent(MainActivity.this, gulshan.class);
        startActivity(gulshan);
    }

    public void uttara(View view) {
        Intent uttara=new Intent(MainActivity.this, uttara.class);
        startActivity(uttara);
    }

    public void about(View view) {
        Intent about=new Intent(MainActivity.this, about.class);
        startActivity(about);
    }
}