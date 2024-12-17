package com.kalkulatorsederhana;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class ActivityKedua extends AppCompatActivity {
    TextView tvData1, tvData2, tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        tvData1 = (TextView) findViewById(R.id.tv_data1);
        tvData2 = (TextView) findViewById(R.id.tv_data2);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);
        tvData1.setText(getIntent().getStringExtra("data1"));
        tvData2.setText(getIntent().getStringExtra("data2"));
        int tambah, angkanya1, angkanya2;
        angkanya1 = Integer.parseInt(tvData1.getText().toString());
        angkanya2 = Integer.parseInt(tvData2.getText().toString());
        tambah = angkanya1+angkanya2;
        tvHasil.setText(tambah+"");
    }
}