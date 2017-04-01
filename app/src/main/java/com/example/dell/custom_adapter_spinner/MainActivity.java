package com.example.dell.custom_adapter_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerDanhSach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerDanhSach = (Spinner) findViewById(R.id.spinner);

        final ArrayList<QuocGia> arrayList = new ArrayList<QuocGia>();
        arrayList.add(new QuocGia(R.drawable.images1, "My", 1000));
        arrayList.add(new QuocGia(R.drawable.images2, "Campuchia", 2000));
        arrayList.add(new QuocGia(R.drawable.images3, "Anh", 3000));
        arrayList.add(new QuocGia(R.drawable.images4, "Han", 4000));
        arrayList.add(new QuocGia(R.drawable.images5, "Nhat", 5000));

        QuocGia_adapter quocGia_adapter = new QuocGia_adapter(this, R.layout.dong_quoc_gia, arrayList);
        spinnerDanhSach.setAdapter(quocGia_adapter);
        spinnerDanhSach.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this ,arrayList.get(position).Ten,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
