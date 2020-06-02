package com.example.gis1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class IslamActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper v_fliper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam);

        ImageView btnpeta1 = findViewById(R.id.petaislam);
        btnpeta1.setOnClickListener(this);

        v_fliper = findViewById(R.id.v_fliper);
        int images[] = {R.drawable.gambarmasjid, R.drawable.gambarmasjid1};

        for (int image :images){
            flipperImages(image);
        }
    }

    private void flipperImages(int image) {
        ImageView imageView = new ImageView(this);

        imageView.setBackgroundResource(image);

        v_fliper.addView(imageView);
        v_fliper.setFlipInterval(4000);
        v_fliper.setAutoStart(true);

        v_fliper.setInAnimation(this,android.R.anim.slide_in_left);

        v_fliper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


    @Override
    public void onClick(View view) {
        Intent petamasjid = new Intent(IslamActivity.this,MapsMasjidActivity.class);
        startActivity(petamasjid);
    }
}
