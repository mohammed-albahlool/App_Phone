package com.example.app_phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);





      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {

              Intent intent = new Intent(getApplicationContext(),MainActivity.class);
              startActivity(intent);
          }
      },3000);



    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}