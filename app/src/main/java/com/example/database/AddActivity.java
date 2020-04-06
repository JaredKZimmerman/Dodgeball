package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity  extends AppCompatActivity {

    private EditText titleBox;
    private EditText directorBox;
    private EditText yearBox;
    private Button addButton;
    private boolean add;

    @Override
    public void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        titleBox = findViewById(R.id.titleBox);
        directorBox = findViewById(R.id.directorBox);
        yearBox = findViewById(R.id.yearBox);
        addButton = findViewById(R.id.addButton);
        Intent i = getIntent();
        add = i.getBooleanExtra("ADD", true);
        if (add) {
            addButton.setText("ADD");
        } else {
            addButton.setText("EDIT");
            titleBox.setText(i.getStringExtra("TITLE"));
            directorBox.setText(i.getStringExtra("DIRECTOR"));
            yearBox.setText(i.getStringExtra("YEAR"));
        }

        }
    public void addPressed (View v){
        String title = titleBox.getText().toString();
        String director = directorBox.getText().toString();
        String year = yearBox.getText().toString();
        DatabaseManager dbm = new DatabaseManager(this);
        if (add)
            dbm.insert(title, director, year);
        else
            dbm.updateByTitle(title, director, year);

        finish();
    }
}