package com.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtAngka1;
    EditText edtAngka2;
    EditText edtHasil;
    Button btnTambah, btnKurang;
    double angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtAngka1 = (EditText) findViewById(R.id.ed_angka1);
        edtAngka2 = (EditText) findViewById(R.id.ed_angka2);
        edtHasil = (EditText) findViewById(R.id.ed_hasil);
        btnTambah = (Button) findViewById(R.id.btn_tambah);
        btnKurang = (Button) findViewById(R.id.btn_kurang);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungTambah();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungKurang();
            }
        });
    }

    private void hitungTambah(){
        angka1 = Double.parseDouble(edtAngka1.getText().toString());
        angka2 = Double.parseDouble(edtAngka2.getText().toString());
        hasil = angka1 + angka2;
        edtHasil.setText(hasil + "");
    }

    private void hitungKurang(){
        angka1 = Double.parseDouble(edtAngka1.getText().toString());
        angka2 = Double.parseDouble(edtAngka2.getText().toString());
        hasil = angka1 - angka2;
        edtHasil.setText(hasil + "");
    }
}
