package com.example.frscnt.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tombolKali;
    private Button tombolBagi;
    private Button tombolTambah;
    private Button tombolKurang;
    private TextView hasil;
    private EditText isi1;
    private EditText isi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolTambah = (Button) findViewById(R.id.tombolTambah);
        tombolKurang = (Button) findViewById(R.id.tombolKurang);
        tombolKali = (Button) findViewById(R.id.tombolKali);
        tombolBagi = (Button) findViewById(R.id.tombolBagi);
        hasil = (TextView) findViewById(R.id.hasil);
        isi1 = (EditText) findViewById(R.id.isi1);
        isi2 = (EditText) findViewById(R.id.isi2);

        tombolTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                hasil.setText(tambah(isi1.getText().toString(), isi2.getText().toString()));
            }
        });

        tombolKurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                hasil.setText(kurang(isi1.getText().toString(), isi2.getText().toString()));
            }
        });

        tombolKali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                hasil.setText(kali(isi1.getText().toString(), isi2.getText().toString()));
            }
        });

        tombolBagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                hasil.setText(bagi(isi1.getText().toString(), isi2.getText().toString()));
            }
        });

    }
    private String tambah(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double hasil1 = d1+d2;
        String hasil2 = String.valueOf(hasil1);
        return hasil2;
    }
    private String kurang(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double hasil1 = d1-d2;
        String hasil2 = String.valueOf(hasil1);
        return hasil2;
    }
    private String kali(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double hasil1 = d1*d2;
        String hasil2 = String.valueOf(hasil1);
        return hasil2;
    }
    private String bagi(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double hasil1 = d1/d2;
        String hasil2 = String.valueOf(hasil1);
        return hasil2;
    }



    }
