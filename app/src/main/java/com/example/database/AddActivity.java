package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity  extends AppCompatActivity {

    private EditText titleBox;
    private EditText directorBox;
    private EditText yearBox;

    @Override
    public void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_add);

        titleBox = findViewById(R.id.titleBox);
        directorBox = findViewById(R.id.directorBox);
        yearBox = findViewById(R.id.yearBox);

    }
    public void addPressed(View v){
        String title = titleBox.getText().toString();
        String director = directorBox.getText().toString();
        String year = yearBox.getText().toString();
        DatabaseManager dbm = new DatabaseManager(this);
        dbm.insert(title, director, year);
        finish();
    }
}