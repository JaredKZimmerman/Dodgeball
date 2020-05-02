package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity  extends AppCompatActivity {

    private EditText wrestlerBox;
    private EditText nicknameBox;
    private EditText finisherBox;
    private Button addButton;
    private boolean add;

    @Override
    public void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        wrestlerBox = findViewById(R.id.wrestlerBox);
        nicknameBox = findViewById(R.id.nicknameBox);
        finisherBox = findViewById(R.id.finisherBox);
        addButton = findViewById(R.id.addButton);
        Intent i = getIntent();
        add = i.getBooleanExtra("ADD", true);
        if (add) {
            addButton.setText("ADD");
        } else {
            addButton.setText("EDIT");
            wrestlerBox.setText(i.getStringExtra("WRESTLER"));
            nicknameBox.setText(i.getStringExtra("NICKNAME"));
            finisherBox.setText(i.getStringExtra("FINISHER"));
        }

        }
    public void addPressed (View v){
        String wrestler = wrestlerBox.getText().toString();
        String nickname = nicknameBox.getText().toString();
        String finisher = finisherBox.getText().toString();
        DatabaseManager dbm = new DatabaseManager(this);
        if (add)
            dbm.insert(wrestler, nickname, finisher);
        else
            dbm.updateByTitle(wrestler, nickname, finisher);

        finish();
    }
}