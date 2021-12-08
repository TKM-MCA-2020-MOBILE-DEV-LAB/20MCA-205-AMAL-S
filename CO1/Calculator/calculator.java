package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   EditText first,second,result;
   int n1,n2;
   String s1,s2,s3;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
   }
   public void inputNum()
   {
       first = (EditText) findViewById(R.id.first);
       second = (EditText) findViewById(R.id.second);
       result = (EditText) findViewById(R.id.result);
       s1 = first.getText().toString();
       s2 = second.getText().toString();
   }
   public void sum(View v)
   {
       inputNum();
       n1 = Integer.parseInt(s1);
       n2 = Integer.parseInt(s2);
       s3 = String.valueOf(n1+n2);
       result.setText(s3);
   }
   public void sub(View v)
   {
       inputNum();
       n1 = Integer.parseInt(s1);
       n2 = Integer.parseInt(s2);
       s3 = String.valueOf(n1-n2);
       result.setText(s3);
   }
   public void mul(View v)
   {
       inputNum();
       n1 = Integer.parseInt(s1);
       n2 = Integer.parseInt(s2);
       s3 = String.valueOf(n1*n2);
       result.setText(s3);
   }
   public void div(View v)
   {
       inputNum();
       n1 = Integer.parseInt(s1);
       n2 = Integer.parseInt(s2);
       s3 = String.valueOf(n1/n2);
       result.setText(s3);
   }
};