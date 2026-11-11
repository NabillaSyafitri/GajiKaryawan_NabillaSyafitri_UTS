package com.example.myapplicationnabillsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivityNabilla extends AppCompatActivity {
    CardView cpGaji, cpPetunjuk, cpTentang, cpExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nabilla);

        cpGaji = findViewById(R.id.cpGaji);
        cpPetunjuk = findViewById(R.id.cpPetunjuk);
        cpTentang = findViewById(R.id.cpTentang);
        cpExit = findViewById(R.id.cpExit);

        cpGaji.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivityNabilla.this, GajiNabilla.class);
                startActivity(x);
            }
        });

        cpPetunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivityNabilla.this, PetunjukNabilla.class);
                startActivity(x);
            }
        });

        cpTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivityNabilla.this, TentangNabilla.class);
                startActivity(x);
            }
        });

        cpExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}