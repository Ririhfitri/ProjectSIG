package com.example.gis1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnislam = findViewById(R.id.islam);
        btnislam.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent menuislam = new Intent(MainActivity.this,IslamActivity.class);
        startActivity(menuislam);

    }
}
