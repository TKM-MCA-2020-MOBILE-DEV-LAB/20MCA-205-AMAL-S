package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView receiver_name;
    TextView receiver_mail;
    TextView receiver_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        receiver_name=(TextView)findViewById(R.id.textView4);
        receiver_mail=(TextView)findViewById(R.id.textView3);
        receiver_phone=(TextView)findViewById(R.id.textView5);

        Intent i= getIntent();
        String str1= i.getStringExtra("name");
        String str2= i.getStringExtra("mail");
        String str3= i.getStringExtra("phone");


        receiver_name.setText(str1);
        receiver_mail.setText(str2);
        receiver_phone.setText(str3);


    }
}
