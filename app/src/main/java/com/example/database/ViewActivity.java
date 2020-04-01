package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity  extends AppCompatActivity{

    private TextView titleView;
    private TextView directorView;
    private TextView yearView;

    @Override
        public void
        onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            titleView = findViewById(R.id.titleView);
            directorView = findViewById(R.id.directorView);
            yearView = findViewById(R.id.yearView);

            DatabaseManager dbm = new DatabaseManager(this);
            Intent i = getIntent();
            String title = i.getStringExtra("TITLE");
            String[] entry = dbm.get(title);
            titleView.setText(entry[0]);
            directorView.setText(entry[1]);
            yearView.setText(entry[2]);

    }
}