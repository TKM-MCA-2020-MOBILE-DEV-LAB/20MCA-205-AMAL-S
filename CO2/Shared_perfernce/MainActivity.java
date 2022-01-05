package com.example.shared_peference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    EditText send_text1;
    EditText send_text2;
    EditText send_text3;
    TextView txt1;
    TextView txt2;
    TextView txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        send_text1=(EditText)findViewById(R.id.editText) ;
        send_text2=(EditText)findViewById(R.id.editText4) ;
        send_text3=(EditText)findViewById(R.id.editText5) ;
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);

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

                SharedPreferences sharedpref=getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedpref.edit();
                editor.putString("key",str1);
                editor.apply();

                SharedPreferences sharedpref1=getSharedPreferences("pref1",MODE_PRIVATE);
                SharedPreferences.Editor editor1=sharedpref1.edit();
                editor1.putString("key1",str2);
                editor1.apply();

                SharedPreferences sharedpref2=getSharedPreferences("pref2",MODE_PRIVATE);
                SharedPreferences.Editor editor2=sharedpref2.edit();
                editor2.putString("key2",int3);
                editor2.apply();

            }
        });
        SharedPreferences getsharedValue=getSharedPreferences("pref",MODE_PRIVATE);
        String value=getsharedValue.getString("key"," default ");
        txt1.setText(value);
        SharedPreferences getsharedValue1=getSharedPreferences("pref1",MODE_PRIVATE);
        String value1=getsharedValue1.getString("key1","default ");
        txt2.setText(value1);
        SharedPreferences getsharedValue2=getSharedPreferences("pref2",MODE_PRIVATE);
        String value2=getsharedValue2.getString("key2","default");
        txt3.setText(value2);
    }
}

