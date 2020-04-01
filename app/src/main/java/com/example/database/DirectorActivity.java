package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DirectorActivity  extends AppCompatActivity {

    @Override
    public void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_director);

        public void searchDB(View v){
            Intent i = new Intent(this, DirectorViewActivity.class);
            startActivity(i);
        }
        if (searchBar == director) {
            DatabaseManager dbm = new DatabaseManager(this);
            Intent i = getIntent();
            String director = i.getStringExtra("DIRECTOR");
            String[] entry = dbm.get(director);
        }

    }
}
