package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class uttara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttara);
    }

    public void comfort(View view) {
        Intent comfort=new Intent(uttara.this,comfort.class);
        startActivity(comfort);
    }

    public void gree(View view) {
        Intent gree=new Intent(uttara.this,green.class);
        startActivity(gree);
    }

    public void faith(View view) {
        Intent faith=new Intent(uttara.this,faith.class);
        startActivity(faith);
    }
}