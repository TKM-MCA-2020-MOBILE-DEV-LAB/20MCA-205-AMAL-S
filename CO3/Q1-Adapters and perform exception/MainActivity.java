package com.example.array1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ListView listView = (ListView) findViewById(R.id.hero);
        String[] heroArray = {"Mohanlal", "Mammoty", "Asif", "Tovino", "Nivin", "Allu Arjun", "Suresh gopi", "Pranav", "DQ", "Fahad"};
        try {
            ArrayAdapter adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, heroArray);
            listView.setAdapter(adapter);
        }
        catch(Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}