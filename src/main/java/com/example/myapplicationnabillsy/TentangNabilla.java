package com.example.myapplicationnabillsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TentangNabilla extends AppCompatActivity {
    Button btKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_nabilla);

        btKembali = findViewById(R.id.btKembali);

        btKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(TentangNabilla.this, MainActivityNabilla.class);
                startActivity(x);
            }
        });
    }
}
