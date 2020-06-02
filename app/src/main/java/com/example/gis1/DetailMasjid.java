package com.example.gis1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailMasjid extends AppCompatActivity implements View.OnClickListener {
    TextView datamasjid, datatelepon, dataketerangan;
    Button btncall;
    ImageView datagambar;

    public static String id, nama, telepon, gambar, keterangan;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masjid);

        datamasjid = findViewById(R.id.namamasjid);
        datatelepon=findViewById(R.id.notelepon);
        dataketerangan=findViewById(R.id.keterangan);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.gambarmasjid);

        datamasjid.setText(nama);
        datatelepon.setText(telepon);
        dataketerangan.setText(keterangan);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telepon));
        startActivity(call);
    }
}
