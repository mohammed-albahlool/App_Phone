package com.example.app_phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PhoneActivity extends AppCompatActivity {


    TextView nameTv;
    TextView relesYearTv;
    TextView priceTv;
    TextView colorTv;
    TextView noteTv;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        im = findViewById(R.id.imageView2);
        nameTv = findViewById(R.id.namePhoneTv2);
        relesYearTv = findViewById(R.id.realesYearTv2);
        priceTv = findViewById(R.id.priceTv2);
        colorTv = findViewById(R.id.colorTv);
        noteTv  = findViewById(R.id.notaTv);

        Intent i = getIntent();
        if(i.hasExtra("name") && i.hasExtra("model") && i.hasExtra("price") && i.hasExtra("photo") && i.hasExtra("color") && i.hasExtra("note")){
            String name = i.getStringExtra("name");
            nameTv.setText(name);
            String model = i.getStringExtra("model");
            relesYearTv.setText(model);
            int price = i.getIntExtra("price",0);
            priceTv.setText(price+"$");
            int photo = i.getIntExtra("photo",0);
            im.setImageResource(photo);
            String color = i.getStringExtra("color");
            colorTv.setText(color);
            String note = i.getStringExtra("note");
            noteTv.setText(note);
        }
        
    }

}