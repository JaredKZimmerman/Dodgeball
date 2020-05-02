package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity  extends AppCompatActivity{


    private TextView nameView;
    private TextView nicknameView;
    private TextView finisherView;

    @Override
        public void
        onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            nameView = findViewById(R.id.wrestlerView);
            nicknameView = findViewById(R.id.nicknameView);
            finisherView = findViewById(R.id.finisherView);

            DatabaseManager dbm = new DatabaseManager(this);
            Intent i = getIntent();
            String name = i.getStringExtra("NAME");
            String[] entry = dbm.get(name);
            nameView.setText(entry[0]);
            nicknameView.setText(entry[1]);
            finisherView.setText(entry[2]);

    }

    public void editPressed(View v){
        Intent i = new Intent(this, AddActivity.class);
        i.putExtra("ADD", false);
        i.putExtra("NAME", nameView.getText().toString());
        i.putExtra("NICKNAME", nicknameView.getText().toString());
        i.putExtra("FINISHING MOVE", finisherView.getText().toString());
        startActivity(i);
    }
}