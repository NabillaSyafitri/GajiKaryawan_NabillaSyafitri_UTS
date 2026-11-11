package com.example.myapplicationnabillsy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class GajiNabilla extends AppCompatActivity {
    EditText edGaji, edJabatan, edMakan, edTransportasi, edKotor, edBersih, edHariKerja;
    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_nabilla);
        edGaji = findViewById(R.id.edGaji);
        edJabatan = findViewById(R.id.edJabatan);
        edMakan = findViewById(R.id.edMakan);
        edTransportasi = findViewById(R.id.edTransportasi);
        edKotor = findViewById(R.id.edKotor);
        edBersih = findViewById(R.id.edBersih);
        edHariKerja = findViewById(R.id.edHariKerja);
        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strgaji = edGaji.getText().toString().trim();
                String strjabat = edJabatan.getText().toString().trim();
                String strkotor = edKotor.getText().toString().trim();

                double gaji  = strgaji.isEmpty() ? 0: Double.parseDouble(strgaji);
                double jabat = strjabat.isEmpty() ? 0: Double.parseDouble(strjabat);
                double kotor = strkotor.isEmpty() ? 0: Double.parseDouble(strkotor);

                float harikerja = Float.parseFloat(edHariKerja.getText().toString());
                float jabatan = Float.parseFloat(edJabatan.getText().toString());

                float tunjangan_makan = (10000 * harikerja);
                float tunjangan_transportasi = (5000 * harikerja);
                double gajikotor = gaji + jabat + tunjangan_makan + tunjangan_transportasi;
                double gajibersih = gajikotor * (0.1);

                try {
                    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
                    String hasilFormatted = formatRupiah.format(tunjangan_makan);
                    String hasilakhir = formatRupiah.format(tunjangan_transportasi);
                    String hasilkotor = formatRupiah.format(gajikotor);
                    String hasilbersih = formatRupiah.format(gajibersih);


                    edMakan.setText("" +hasilFormatted);
                    edTransportasi.setText("" +hasilakhir);
                    edKotor.setText(""+hasilkotor);
                    edBersih.setText(""+hasilbersih);

                } finally {

                }
            };
        });
    }
}
