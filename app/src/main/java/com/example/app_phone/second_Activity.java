package com.example.app_phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class second_Activity extends AppCompatActivity {


    ListView listView;
    ArrayList<Phone> listPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        listView = findViewById(R.id.listView);
        listPhone = new ArrayList<>();

       Phone p1 = new Phone();
        p1.setName("not10");
        p1.setModel("2020");
        p1.setPrice(1500);
        p1.setPhotoIm(R.drawable.not10);
        p1.setColor("احمر");
        p1.setNote("الجوال يحتوي على ذاكرة 128 GB");

        Phone p2 = new Phone();
        p2.setName("not10s");
        p2.setModel("2021");
        p2.setPrice(2000);
        p2.setPhotoIm(R.drawable.not10s);
        p2.setColor("احمر");
        p2.setNote("الجوال يحتوي على RAM 4");

        Phone p3 = new Phone();
        p3.setName("not8");
        p3.setModel("2022");
        p3.setPrice(800);
        p3.setPhotoIm(R.drawable.not8);
        p3.setColor("احمر");
        p3.setNote("الجوال يحتوي على معالج قوي");

        Phone p4 = new Phone();
        p4.setName("not9");
        p4.setModel("2021");
        p4.setPrice(1600);
        p4.setPhotoIm(R.drawable.not9);
        p4.setColor("احمر");
        p4.setNote("الجوال يحتوي على كاميرا بجودة عالية ");

        Phone p5 = new Phone();
        p5.setName("not9s");
        p5.setModel("2022");
        p5.setPrice(3000);
        p5.setPhotoIm(R.drawable.not9s);
        p5.setColor("احمر");
        p5.setNote("الجوال يحتوي على اللمس عن بعد");

        listPhone.add(p1);
        listPhone.add(p2);
        listPhone.add(p3);
        listPhone.add(p4);
        listPhone.add(p5);


        MyAdapter adapter = new MyAdapter(getApplicationContext(),listPhone);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = listPhone.get(position).getName();
                String model = listPhone.get(position).getModel();
                int price = listPhone.get(position).getPrice();
                int photo = listPhone.get(position).getPhotoIm();
                String color = listPhone.get(position).getColor();
                String note = listPhone.get(position).getNote();

                Intent i = new Intent(getApplicationContext(),PhoneActivity.class);
                i.putExtra("name",name);
                i.putExtra("model",model);
                i.putExtra("price",price);
                i.putExtra("photo",photo);
                i.putExtra("color",color);
                i.putExtra("note",note);
                startActivity(i);

            }
        });




    }
}