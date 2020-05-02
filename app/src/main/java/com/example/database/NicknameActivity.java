package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NicknameActivity  extends AppCompatActivity {

    public EditText searchBar;

    @Override
    public void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_nickname);

        searchBar = findViewById(R.id.searchBar);

    }

    public void searchDB(View v){
        Intent i = new Intent(this, WrestlerActivity.class);
        String nickname = searchBar.getText().toString();
        i.putExtra("NICKNAME", nickname);
        startActivity(i);
    }

}
