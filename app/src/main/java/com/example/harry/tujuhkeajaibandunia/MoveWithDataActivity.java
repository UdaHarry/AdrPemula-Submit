package com.example.harry.tujuhkeajaibandunia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class MoveWithDataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        Intent intent = getIntent();
        Keajaiban keajaiban = intent.getParcelableExtra("KIRIM");
        String remark = keajaiban.getRemarks();
        String about = keajaiban.getKeterangan();
        String lokasi = keajaiban.getRemarks();
        String regional = keajaiban.getRegional();
        String koordinat = keajaiban.getKoordinat();
        String title = keajaiban.getName();

        getSupportActionBar().setTitle(title);

        ImageView imgPhoto = findViewById(R.id.img_photo);

        Glide.with(this)
                .load(keajaiban.getPhoto())
                .into(imgPhoto);

        TextView nmLocation = findViewById(R.id.nm_location);
        nmLocation.setText(remark);

        TextView tvAbout = findViewById(R.id.show_about);
        tvAbout.setText(about);

        TextView tvLokasi = findViewById(R.id.show_lokasi);
        tvLokasi.setText(lokasi);

        TextView tvRegional = findViewById(R.id.show_regional);
        tvRegional.setText(regional);

        TextView tvKoordinat = findViewById(R.id.show_koordinat);
        tvKoordinat.setText(koordinat);
    }
}
