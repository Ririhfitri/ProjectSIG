package com.example.gis1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class HinduActivity extends AppCompatActivity {

    ViewFlipper v_fliper1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindu);

        v_fliper1 = findViewById(R.id.v_fliper);
        int images[] = {R.drawable.gambarpura, R.drawable.gambarpura1};

        for (int image :images){
            flipperImages(image);
        }
    }

    private void flipperImages(int image) {
        ImageView imageView = new ImageView(this);

        imageView.setBackgroundResource(image);

        v_fliper1.addView(imageView);
        v_fliper1.setFlipInterval(4000);
        v_fliper1.setAutoStart(true);

        v_fliper1.setInAnimation(this,android.R.anim.slide_in_left);

        v_fliper1.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
