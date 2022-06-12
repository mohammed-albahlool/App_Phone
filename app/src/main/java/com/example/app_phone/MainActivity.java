package com.example.app_phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textView ;
    EditText Email , Password , Confpassword;
    Button button ;
    SharedPreferences sharedPreferences;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("app", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();

     /*   if(sharedPreferences.contains("Email")&&sharedPreferences.contains("Password")&&sharedPreferences.contains("Confpassword")){
            Email.setText(sharedPreferences.getString("Email",""));
            Password.setText(sharedPreferences.getString("Password",""));
            Confpassword.setText(sharedPreferences.getString("Confpassword",""));
        }*/
       textView = findViewById(R.id.textview);
        Email = findViewById(R.id.editText1);
        Password = findViewById(R.id.editText2);
        Confpassword = findViewById(R.id.editText3);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!Email.getText().toString().isEmpty()
                        && !Password.getText().toString().isEmpty()
                        && !Confpassword.getText().toString().isEmpty()){

                    if(Email.getText().toString().equalsIgnoreCase("admin@gmail.com")
                            && Password.getText().toString().equalsIgnoreCase("1234")
                            && Confpassword.getText().toString().equalsIgnoreCase("1234") ){
                      editor.putString("Email", "admin@gmail.com");
                      editor.putString("Password", "1234");
                      editor.putString("Confpassword", "1234");
                      editor.commit();
                        Intent intent = new Intent(getApplicationContext(),second_Activity.class);
                        startActivity(intent);

                    }
                    else{

                        Toast.makeText(getApplicationContext(), "خطأ في كلمة المرور", Toast.LENGTH_SHORT).show();
                    }


                } else {

                    Toast.makeText(getApplicationContext(), "الرجاء ادخال الحقول الفارغة", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}