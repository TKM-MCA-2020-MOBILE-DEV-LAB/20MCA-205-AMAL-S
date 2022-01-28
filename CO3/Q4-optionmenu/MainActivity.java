package com.example.menuoption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu)
        {
            MenuInflater i= getMenuInflater();
            i.inflate(R.menu.menu1,menu);
            return  true;
            // return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item)
        {
            int id=item.getItemId();
            if(id==R.id.action_contact)
            {
                Intent contactintent=new Intent(MainActivity.this,contact.class);
                startActivity(contactintent);
            }
            if(id==R.id.action_settings)
            {
                Intent settingsintent=new Intent(MainActivity.this,settings.class);
                startActivity(settingsintent);
            }
            if (id==R.id.action_Help)
            {
                Intent helpintent=new Intent(MainActivity.this,Help.class);
                startActivity(helpintent);
            }
            if(id==R.id.action_share)
            {
                Intent shareintent=new Intent(MainActivity.this,share.class);
                startActivity(shareintent);
            }
            return super.onOptionsItemSelected(item);

        }
}