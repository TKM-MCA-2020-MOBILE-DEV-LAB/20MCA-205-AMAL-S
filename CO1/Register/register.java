package com.example.admin.register;
import androidx.appcompact.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View view){
        EditText edt = findViewById(R.id.editText);
        EditText edt1 = findViewById(R.id.editText2);
        EditText edt2 = findViewById(R.id.editText3 );
        TextView txt1 =findViewById(R.id.textView);
        TextView txt2 =findViewById(R.id.textView2 );
        TextView txt3 =findViewById(R.id.textView3);
        txt1.setText("hello"+edt .getText().toString() );
        txt2.setText("lastname"+edt1 .getText().toString() );
        txt3.setText("email"+edt2 .getText().toString() );
    }

}