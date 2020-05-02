package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewWrestler(View v){
        Intent i = new Intent(this, WrestlerActivity.class);
        startActivity(i);
    }

    public void addWrestler(View v){
        Intent i = new Intent(this, AddActivity.class);
        i.putExtra("ADD", true);
        startActivity(i);
    }

    public void addNickname(View v){
        Intent i = new Intent(this, NicknameActivity.class);
        startActivity(i);
    }
    public void deleteWrestler (View v){
        Intent i = new Intent(this, DeleteActivity.class);
        startActivity(i);
    }

}
