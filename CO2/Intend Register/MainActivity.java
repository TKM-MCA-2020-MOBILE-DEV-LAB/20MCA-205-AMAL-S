package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText send_text1;
    EditText send_text2;
    EditText send_text3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = (Button) findViewById(R.id.button);
        send_text1=(EditText)findViewById(R.id.editText) ;
        send_text2=(EditText)findViewById(R.id.editText4) ;
        send_text3=(EditText)findViewById(R.id.editText5) ;

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1 =send_text1.getText().toString();
                String str2=send_text2.getText().toString();
                String int3=send_text3.getText().toString();

                //you can use anything in place of i
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("name",str1);
                i.putExtra("mail",str2);
                i.putExtra("phone",int3);

                startActivity(i);

            }
        });
    }}